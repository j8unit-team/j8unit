package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalMonitorStateExceptionTest
implements org.j8unit.repository.java.lang.IllegalMonitorStateExceptionTests<java.lang.IllegalMonitorStateException> {

    @Override
    public java.lang.IllegalMonitorStateException createNewSUT() {
        return new java.lang.IllegalMonitorStateException();
    }

}
