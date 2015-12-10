package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalThreadStateExceptionTest
implements org.j8unit.repository.java.lang.IllegalThreadStateExceptionTests<java.lang.IllegalThreadStateException> {

    @Override
    public java.lang.IllegalThreadStateException createNewSUT() {
        return new java.lang.IllegalThreadStateException();
    }

}
