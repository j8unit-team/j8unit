package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CopyOnWriteArrayListTest<E>
implements org.j8unit.repository.java.util.concurrent.CopyOnWriteArrayListTests<java.util.concurrent.CopyOnWriteArrayList<E>, E> {

    @Override
    public java.util.concurrent.CopyOnWriteArrayList<E> createNewSUT() {
        return new java.util.concurrent.CopyOnWriteArrayList();
    }

}
