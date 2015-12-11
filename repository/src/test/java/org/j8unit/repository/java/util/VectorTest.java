package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VectorTest<E>
implements org.j8unit.repository.java.util.VectorTests<java.util.Vector<E>, E> {

    @Override
    public java.util.Vector<E> createNewSUT() {
        return new java.util.Vector<>();
    }

}
