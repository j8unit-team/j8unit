package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayDequeTest<E>
implements org.j8unit.repository.java.util.ArrayDequeTests<java.util.ArrayDeque<E>, E> {

    @Override
    public java.util.ArrayDeque<E> createNewSUT() {
        return new java.util.ArrayDeque<>();
    }

}
