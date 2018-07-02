package com.lquan.charp1.one.five.one;

public class Test {
	
	public static void main(String[] args) {
		GenericMemoryCell<String> genericMemoryCell =new GenericMemoryCell<>();
		genericMemoryCell.write("lquan");
		System.out.println(genericMemoryCell.read());
		
		
	}

}
