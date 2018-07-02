package com.lquan.charp1.one.four.two;

import com.lquan.charp1.one.four.one.MemoryCell;

/**
 * 1.4.2 基本类型的包装
 * 		包装类的由来：我们存储一个基本的类型，并添加一些这种基本类型不支持或不能正确支持的操作。
 * java 的8种基本类型中的每一种都提供了包装类。
 * @author lquan
 *
 */
public class WrapperDemo {

	public static void main(String[] args) {
		MemoryCell memoryCell = new MemoryCell();
		memoryCell.write(new Integer(44));
		Integer aString = (Integer) memoryCell.read();
		int val = aString.intValue();
		System.out.println(val);

	}

}
