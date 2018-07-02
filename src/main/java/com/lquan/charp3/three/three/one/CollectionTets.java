package com.lquan.charp3.three.three.one;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * 测试collection接口
 * @author lquan
 *
 */
public interface CollectionTets<E> extends Iterable<E> {
	

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

    boolean removeAll(Collection<?> c);


    boolean retainAll(Collection<?> c);

    void clear();
    
    boolean equals(Object o);

    int hashCode();

 


}
