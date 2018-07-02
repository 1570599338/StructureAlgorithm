package com.lquan.charp1.one.four.one;

/**
 * 1.4.1 使用object表示泛型
 * @author lquan
 *
 */
public class MemoryCell {
    private Object storedValue;
	
    // Public methods
    public Object read(){ 
    	return storedValue; 
    }
    
    public void write( Object x ){ 
    	storedValue = x; 
    }
}
