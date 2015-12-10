package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EmptyStackExceptionTest
implements org.j8unit.repository.java.util.EmptyStackExceptionTests<java.util.EmptyStackException> {

    @Override
    public java.util.EmptyStackException createNewSUT() {
        return new java.util.EmptyStackException();
    }

}
