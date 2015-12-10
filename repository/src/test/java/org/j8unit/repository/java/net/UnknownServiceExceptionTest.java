package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownServiceExceptionTest
implements org.j8unit.repository.java.net.UnknownServiceExceptionTests<java.net.UnknownServiceException> {

    @Override
    public java.net.UnknownServiceException createNewSUT() {
        return new java.net.UnknownServiceException();
    }

}
