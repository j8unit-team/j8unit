package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentSkipListSetTest<E>
implements org.j8unit.repository.java.util.concurrent.ConcurrentSkipListSetTests<java.util.concurrent.ConcurrentSkipListSet<E>, E> {

    @Override
    public java.util.concurrent.ConcurrentSkipListSet<E> createNewSUT() {
        return new java.util.concurrent.ConcurrentSkipListSet<>();
    }

}
