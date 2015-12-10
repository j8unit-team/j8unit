package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalArgumentExceptionTest
implements org.j8unit.repository.java.lang.IllegalArgumentExceptionTests<java.lang.IllegalArgumentException> {

    @Override
    public java.lang.IllegalArgumentException createNewSUT() {
        return new java.lang.IllegalArgumentException();
    }

}
