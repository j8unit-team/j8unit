package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindExceptionTest
implements org.j8unit.repository.java.net.BindExceptionTests<java.net.BindException> {

    @Override
    public java.net.BindException createNewSUT() {
        return new java.net.BindException();
    }

}
