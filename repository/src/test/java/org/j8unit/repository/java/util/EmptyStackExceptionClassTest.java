package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EmptyStackExceptionClassTest
implements org.j8unit.repository.java.util.EmptyStackExceptionClassTests<java.util.EmptyStackException> {

    @Override
    public Class<java.util.EmptyStackException> createNewSUT() {
        return java.util.EmptyStackException.class;
    }

}
