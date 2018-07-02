package com.lquan.charp1.one.five.three;

import com.lquan.charp1.one.five.one.GenericMemoryCell;

/**
 * 1.5.3 菱形运算符
 *   m已经是GenericMemoryCell<Integer>类型了，显然创建的对象也必须是GenericMemoryCell<Integer>
 *   类型的，任何其他的类型的参数，都会产生编译错误。
 */
public class BoxingDemo {

	public static void main(String[] args) {

		//GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();
		GenericMemoryCell<Integer> m = new GenericMemoryCell<>();// 上面的
		 m.write(37);
		 int val = m.read();
		 System.out.println("Contents are: "+val);
		 
		 
		 
		 System.out.println(new Integer(250000)==250000);
		 
		 Integer aa=122;
		 Integer ab=122;
		
		 System.out.println(aa+"="+ab+":"+(aa==ab)+"^^^^^^"+ aa.equals(ab));
	}

}
