package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeSetTest<E>
implements org.j8unit.repository.java.util.TreeSetTests<java.util.TreeSet<E>, E> {

    @Override
    public java.util.TreeSet<E> createNewSUT() {
        return new java.util.TreeSet<>();
    }

}
