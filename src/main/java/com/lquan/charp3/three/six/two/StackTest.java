package com.lquan.charp3.three.six.two;

import java.util.Scanner;
import java.util.Stack;

import org.junit.Test;

/**
 * 栈相关的测试
 * 		1, 栈的应用  平衡符号
 * 
 * 
 * @author lquan
 *
 */
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		System.out.println(stack + "***" + stack.size());
		System.out.println(readSymbol());

	}
	
	/**
	 * 测试栈的平衡符号应用
	 */
	@Test
	public void name() {
		System.out.println(readSymbol());
	}
	
	private static boolean readSymbol() {
		Scanner in = new Scanner(System.in);
		// 存储开放符号（左半个）
		Stack<String> stack = new Stack<>();
		String readStrs = in.nextLine();
		// 转化数组，以便逐个判断
		char[] charArr = readStrs.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			String readStr = String.valueOf(charArr[i]);
			if (isOpenSymbol(readStr)) {// 是开放符号，压入栈中
				stack.push(readStr);

			} else if (isCloseSymbol(readStr)) {// 是关闭符号再执行，其他字符忽略
				if (stack.isEmpty()) {// 栈为空，证明字符擦混中只有关闭符号，返回false
					in.close();
					return false;
				} else {// 符号不是一对，返回false
					if (!isTwin(stack.peek(), readStr)) {
						in.close();
						return false;
					} else {// 符号是一对，将符号弹出栈
						stack.pop();
					}
				}

			}

		}
		if (!stack.isEmpty()) {// 在字符数组遍历完后判断是否为空，不空证明没有关闭符号返回false
			in.close();
			return false;
		} else {// 空返回true
			in.close();
			return true;
		}

	}

	/**
	 * 判断是不是开放符号（也就是括号的左半个）
	 * 
	 * @param symbol
	 * @return
	 */
	public static boolean isOpenSymbol(String symbol) {
		String symbolList = "{[(";
		if (symbolList.contains(symbol))
			return true;
		return false;
	}

	/**
	 * 判断是不是关闭符号（也就是括号的右半个）
	 * 
	 * @param symbol
	 * @return
	 */
	public static boolean isCloseSymbol(String symbol) {
		String symbolList = "}])";
		if (symbolList.contains(symbol))
			return true;
		return false;
	}

	/**
	 * 判断符号是否是一对
	 * 
	 * @param openSymbol
	 * @param closeSymbol
	 * @return
	 */
	public static boolean isTwin(String openSymbol, String closeSymbol) {
		if (openSymbol.equals("(") && closeSymbol.equals(")"))
			return true;
		else if (openSymbol.equals("{") && closeSymbol.equals("}"))
			return true;
		else if (openSymbol.equals("[") && closeSymbol.equals("]"))
			return true;
		return false;
	}
}
