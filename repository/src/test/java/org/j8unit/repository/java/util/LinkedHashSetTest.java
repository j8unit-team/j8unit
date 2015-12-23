package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkedHashSetTest<E>
implements org.j8unit.repository.java.util.LinkedHashSetTests<java.util.LinkedHashSet<E>, E> {

    @Override
    public java.util.LinkedHashSet<E> createNewSUT() {
        return new java.util.LinkedHashSet();
    }

}
