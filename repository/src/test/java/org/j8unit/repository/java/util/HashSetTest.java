package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashSetTest<E>
implements org.j8unit.repository.java.util.HashSetTests<java.util.HashSet<E>, E> {

    @Override
    public java.util.HashSet<E> createNewSUT() {
        return new java.util.HashSet();
    }

}
