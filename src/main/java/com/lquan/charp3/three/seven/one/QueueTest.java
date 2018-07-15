package com.lquan.charp3.three.seven.one;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 测试队列
 * @author lquan
 *
 */
public class QueueTest {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue.element());
		Queue<Integer> queLink = new LinkedList<>();
		
		
	}

}
