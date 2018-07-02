package com.lquan.charp3.three.three.three;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List接口
 * @author lquan
 *
 * @param <E>
 */

public interface ListTest<E> extends Collection<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<E> iterator();

    Object[] toArray();

    <T> T[] toArray(T[] a);
    boolean add(E e);

    boolean remove(Object o);

    boolean containsAll(Collection<?> c);

    boolean addAll(Collection<? extends E> c);

    boolean addAll(int index, Collection<? extends E> c);

    boolean removeAll(Collection<?> c);

    boolean retainAll(Collection<?> c);

    void clear();

    boolean equals(Object o);

    int hashCode();

    E get(int index);

    /**
     * 用指定元素替换列表中指定位置的元素（可选操作）。
     * @param index
     * @param element
     * @return
     */
    E set(int index, E element);

    void add(int index, E element);

    E remove(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    ListIterator<E> listIterator();

    /**
     *  返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始。
     * @param index
     * @return
     */
    ListIterator<E> listIterator(int index);

    List<E> subList(int fromIndex, int toIndex);


}
