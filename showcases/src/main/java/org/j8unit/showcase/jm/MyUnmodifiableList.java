package org.j8unit.showcase.jm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class MyUnmodifiableList<E>
implements List<E> {

    private List<E> base;

    public MyUnmodifiableList() {
        this.base = Collections.unmodifiableList(new ArrayList<>());
    }

    public MyUnmodifiableList(final Collection<E> c) {
        this.base = Collections.unmodifiableList(new ArrayList<>(c));
    }

    @Override
    public int size() {
        return this.base.size();
    }

    @Override
    public boolean isEmpty() {
        return this.base.isEmpty();
    }

    @Override
    public boolean contains(final Object o) {
        return this.base.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return this.base.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.base.toArray();
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return this.base.toArray(a);
    }

    @Override
    public boolean add(final E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        return this.base.containsAll(c);
    }

    @Override
    public boolean addAll(final Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(final int index, final Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(final Predicate<? super E> filter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(final UnaryOperator<E> operator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(final Comparator<? super E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.base = Collections.unmodifiableList(new ArrayList<>());
    }

    @Override
    public E get(final int index) {
        return this.base.get(index);
    }

    @Override
    public E set(final int index, final E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(final int index, final E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(final int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(final Object o) {
        return this.base.indexOf(o);
    }

    @Override
    public int lastIndexOf(final Object o) {
        return this.base.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.base.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(final int index) {
        return this.base.listIterator(index);
    }

    @Override
    public List<E> subList(final int fromIndex, final int toIndex) {
        return this.base.subList(fromIndex, toIndex);
    }

}
