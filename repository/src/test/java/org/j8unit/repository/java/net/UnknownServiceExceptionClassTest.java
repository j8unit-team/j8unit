package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownServiceExceptionClassTest
implements org.j8unit.repository.java.net.UnknownServiceExceptionClassTests<java.net.UnknownServiceException> {

    @Override
    public Class<java.net.UnknownServiceException> createNewSUT() {
        return java.net.UnknownServiceException.class;
    }

}
