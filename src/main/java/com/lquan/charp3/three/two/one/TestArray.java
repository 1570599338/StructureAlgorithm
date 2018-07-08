package com.lquan.charp3.three.two.one;


/**
 * 表 -- 数组的简单扩容源码问题
 * @author lquan
 *
 */
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		String [] brrr = new String[10];
		String aa="1";
		String cc = aa.concat("2");
		//System.out.println(cc);
		//Arrays
		String [] brr={"a","b","4"};
		//System.arraycopy(brr, 0, arr, 0, Math.min(brr.length, arr.length));
//		for(String aax:brrr)
//		System.out.println(aax);
		
		int[]  x={1,2,3,4,5};
		System.arraycopy(x, 0, arr, 5, Math.min(x.length, arr.length));
		for(int bx:arr)
		System.out.println(bx);
	}

}
