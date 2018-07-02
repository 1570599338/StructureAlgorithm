package com.lquan.charp3.three.three.one;

import java.util.Collection;
import java.util.Iterator;


/**
 * 测试collection接口
 * @author lquan
 *
 */
public interface CollectionTets<E> extends Iterable<E> {
	
	/**
	 * 添加
	 * @param e
	 * @return
	 */
	boolean add(E e);

	/**
	 * 删除
	 * @param o
	 * @return
	 */
	boolean remove(Object o);
	
    boolean addAll(Collection<? extends E> c);

    boolean removeAll(Collection<?> c);

    int size();

    /**
     * 如果此 collection 不包含元素，则返回 true。
     * @return
     */
    boolean isEmpty();

    /**
     * 如果此 collection 包含指定的元素，则返回 true。
     * @param o
     * @return
     */
    boolean contains(Object o);

    /**
     *  返回在此 collection 的元素上进行迭代的迭代器。
     */
    Iterator<E> iterator();

    /**
     * 返回包含此 collection 中所有元素的数组。
     * @return
     */
    Object[] toArray();

    <T> T[] toArray(T[] a);

    boolean containsAll(Collection<?> c);

    boolean retainAll(Collection<?> c);

    void clear();
    
    boolean equals(Object o);

    int hashCode();

 


}
