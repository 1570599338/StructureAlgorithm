package others;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Mayank Kumar (mk9440)
 */
/*
Output :

Enter number of distinct letters 
6
Enter letters with its frequncy to encode
Enter letter : a
Enter frequncy : 45

Enter letter : b
Enter frequncy : 13

Enter letter : c
Enter frequncy : 12

Enter letter : d
Enter frequncy : 16

Enter letter : e
Enter frequncy : 9

Enter letter : f
Enter frequncy : 5

Letter		Encoded Form
a		0 
b		1 0 1 
c		1 0 0 
d		1 1 1 
e		1 1 0 1 
f		1 1 0 0 

*/

class Nodet{
	String letr="";    
	int freq=0,data=0;
	Nodet left=null,right=null;
}

//A comparator class to sort list on the basis of their frequency
class comp implements Comparator<Nodet>{
 @Override
    public int compare(Nodet o1, Nodet o2) {
        if(o1.freq>o2.freq){return 1;}
        else if(o1.freq<o2.freq){return -1;}
        else{return 0;}
    }
}


public class Huffman {
    
    // A simple function to print a given list
    //I just made it for debugging
    public static void print_list(List li){
    Iterator<Nodet> it=li.iterator();
    while(it.hasNext()){Nodet n=it.next();System.out.print(n.freq+" ");}System.out.println();
    }
    
    //Function for making tree (Huffman Tree)
    public static Nodet make_huffmann_tree(List li){
    //Sorting list in increasing order of its letter frequency    
    li.sort(new comp());
    Nodet temp=null;
    Iterator it=li.iterator();
    //System.out.println(li.size());
    //Loop for making huffman tree till only single Nodet remains in list
    while(true){
    temp=new Nodet();
    //a and b are  Nodet which are to be combine to make its parent
    Nodet a=new Nodet(),b=new Nodet();
    a=null;b=null;
    //checking if list is eligible for combining or not
    //here first assignment of it.next in a will always be true as list till end will
    //must have atleast one Nodet
    a=(Nodet)it.next();
    //Below condition is to check either list has 2nd Nodet or not to combine 
    //If this condition will be false, then it means construction of huffman tree is completed
    if(it.hasNext()){b=(Nodet)it.next();}
    //Combining first two smallest Nodets in list to make its parent whose frequncy 
    //will be equals to sum of frequency of these two Nodets 
    if(b!=null){
    temp.freq=a.freq+b.freq;a.data=0;b.data=1;//assigining 0 and 1 to left and right Nodets
    temp.left=a;temp.right=b;
    //after combing, removing first two Nodets in list which are already combined
    li.remove(0);//removes first element which is now combined  -step1
    li.remove(0);//removes 2nd element which comes on 1st position after deleting first in step1
    li.add(temp);//adding new combined Nodet to list
    //print_list(li);  //For visualizing each combination step
    }
    //Sorting after combining to again repeat above on sorted frequency list
    li.sort(new comp());    
    it=li.iterator();//resetting list pointer to first Nodet (head/root of tree)
    if(li.size()==1){return (Nodet)it.next();} //base condition ,returning root of huffman tree    
    }
}
    
    //Function for finding path between root and given letter ch
    public static void dfs(Nodet n,String ch){
        Stack<Nodet> st=new Stack(); // stack for storing path
        int freq=n.freq; // recording root freq to avoid it adding in path encoding
        find_path_and_encode(st,n,ch,freq);
    }
    
    //A simple utility function to print stack (Used for printing path)
    public static void print_path(Stack<Nodet> st){
    for(int i=0;i<st.size();i++){
    System.out.print(st.elementAt(i).data+" ");
    }
    }
    
    public static void find_path_and_encode(Stack<Nodet> st,Nodet root,String s,int f){
    //Base condition
    if(root!= null){
    if(root.freq!=f){st.push(root);} // avoiding root to add in path/encoding bits
    if(root.letr.equals(s)){print_path(st);return;} // Recursion stopping condition when path gets founded
    find_path_and_encode(st,root.left,s,f);
    find_path_and_encode(st,root.right,s,f); 
    //Popping if path not found in right or left of this Nodet,because we previously 
    //pushed this Nodet in taking a mindset that it might be in path
    st.pop();    
    }    
    }
    
    public static void main(String args[]){
	    List <Nodet> li=new LinkedList<>();
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter number of distinct letters ");
	    int n=in.nextInt();
	    String s[]=new String[n];
	    System.out.print("Enter letters with its frequncy to encode\n");
	    for(int  i=0;i<n;i++){
	    Nodet a=new Nodet();
	    System.out.print("Enter letter : ");
	    a.letr=in.next();s[i]=a.letr;
	    System.out.print("Enter frequncy : ");
	    a.freq=in.nextInt();System.out.println();
	    li.add(a);
	    }
	    Nodet root=new Nodet();
	    root=make_huffmann_tree(li);
	    System.out.println("Letter\t\tEncoded Form");
	    for(int i=0;i<n;i++){
	    System.out.print(s[i]+"\t\t");dfs(root,s[i]);System.out.println();}
     }
}
