package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkedBlockingDequeTest<E>
implements org.j8unit.repository.java.util.concurrent.LinkedBlockingDequeTests<java.util.concurrent.LinkedBlockingDeque<E>, E> {

    @Override
    public java.util.concurrent.LinkedBlockingDeque<E> createNewSUT() {
        return new java.util.concurrent.LinkedBlockingDeque();
    }

}
