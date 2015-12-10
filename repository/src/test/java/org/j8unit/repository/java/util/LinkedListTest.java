package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkedListTest<E>
implements org.j8unit.repository.java.util.LinkedListTests<java.util.LinkedList<E>, E> {

    @Override
    public java.util.LinkedList<E> createNewSUT() {
        return new java.util.LinkedList();
    }

}
