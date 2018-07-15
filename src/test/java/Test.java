import java.util.ArrayList;

/**
 * 对于多重循环情况下，遇到return相当于推出for循环了 
 * @author lquan
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(40));

	}
	
	   public static boolean prime(int num) { // checking if number is prime or not
		   int count1=0;
		   int count2=0;
		   for (int j = 2; j <= num / 2; j++) {
			   count1++;
			   System.out.println(count1);
	        for (int divisor = 2; divisor <= num / 2; divisor++) {
	        	count2++;
	        	System.out.println(count2);
	            if (num % divisor == 0) {
	                return false; //  false if not prime
	            }
	        }
	        
	        return true; // True if prime
	    }
		   return false;
	   }
	   

}
