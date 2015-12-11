package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StackTest<E>
implements org.j8unit.repository.java.util.StackTests<java.util.Stack<E>, E> {

    @Override
    public java.util.Stack<E> createNewSUT() {
        return new java.util.Stack<>();
    }

}
