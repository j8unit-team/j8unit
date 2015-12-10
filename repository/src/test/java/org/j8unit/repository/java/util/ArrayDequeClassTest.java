package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ArrayDequeClassTest
implements org.j8unit.repository.java.util.ArrayDequeClassTests<java.util.ArrayDeque> {

    @Override
    public Class<java.util.ArrayDeque> createNewSUT() {
        return java.util.ArrayDeque.class;
    }

}
