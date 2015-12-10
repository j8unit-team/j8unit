package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalStateExceptionTest
implements org.j8unit.repository.java.lang.IllegalStateExceptionTests<java.lang.IllegalStateException> {

    @Override
    public java.lang.IllegalStateException createNewSUT() {
        return new java.lang.IllegalStateException();
    }

}
