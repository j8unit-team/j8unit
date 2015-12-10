package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedOperationExceptionTest
implements org.j8unit.repository.java.lang.UnsupportedOperationExceptionTests<java.lang.UnsupportedOperationException> {

    @Override
    public java.lang.UnsupportedOperationException createNewSUT() {
        return new java.lang.UnsupportedOperationException();
    }

}
