package com.lquan.charp1.one.five.two;

import com.lquan.charp1.one.five.one.GenericMemoryCell;

/**
 * 1.5.2 自动装箱/拆箱
 * @author lquan
 * 自动拆箱：原理：Integer对象被放到需要int变量的地方，则编译器将在幕后插入一个对intValue方法的调用，这叫做自动拆箱。
 * 		   why：典型理由因为封装类型是不能进行运算的，只有转换成基本类型才能进行运算。
 */
public class BoxingDemo {

	public static void main(String[] args) {

		GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();
		 m.write(37);
		 int val = m.read();
		 System.out.println("Contents are: "+val);
		 
		 
		 
		 System.out.println(new Integer(250000)==250000);
		 
		 Integer aa=122;
		 Integer ab=122;
		
		 System.out.println(aa+"="+ab+":"+(aa==ab)+"^^^^^^"+ aa.equals(ab));
	}

}
