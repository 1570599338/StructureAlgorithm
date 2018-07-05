package com.lquan.charp3.three.three.three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = new ArrayList<>();// 菱形运算
		List<Integer> listInt2 = new LinkedList<>();
		listInt.add(1);
		listInt.add(0, 1);
		listInt.get(1);
		//System.out.println(0>>1);
		listInt.remove(1);
		
		// copy函数
		int[]  srcList={1,2,3,4,5};
		int[]  descList={8,9};
		System.arraycopy(srcList, 0, descList, 0, Math.min(srcList.length, descList.length));
		for(int bx:descList)
			System.out.println(bx);
	}

}
