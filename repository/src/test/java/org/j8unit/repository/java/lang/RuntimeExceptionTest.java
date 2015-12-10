package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeExceptionTest
implements org.j8unit.repository.java.lang.RuntimeExceptionTests<java.lang.RuntimeException> {

    @Override
    public java.lang.RuntimeException createNewSUT() {
        return new java.lang.RuntimeException();
    }

}
