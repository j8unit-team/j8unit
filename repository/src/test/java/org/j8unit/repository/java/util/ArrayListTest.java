package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayListTest<E>
implements org.j8unit.repository.java.util.ArrayListTests<java.util.ArrayList<E>, E> {

    @Override
    public java.util.ArrayList<E> createNewSUT() {
        return new java.util.ArrayList<>();
    }

}
