package com.lquan.charp1.one.four.one;

/**
 * 测试使用object来表示泛型
 * 		其中存在着细节问题1，可以在最后不需要强制转换String类型，因为打印的时候会调用toString方法
 * 			2，不能是用基本类型，只能使用引用类型能够与object相容
 * 			
 * @author lquan
 *
 */
public class Test {

	public static void main(String[] args) {
		MemoryCell memoryCell = new MemoryCell();
		memoryCell.write(41);
		String aString = (String) memoryCell.read();
		System.out.println(aString);

	}

}
