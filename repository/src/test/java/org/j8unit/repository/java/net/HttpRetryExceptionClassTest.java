package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpRetryExceptionClassTest
implements org.j8unit.repository.java.net.HttpRetryExceptionClassTests<java.net.HttpRetryException> {

    @Override
    public Class<java.net.HttpRetryException> createNewSUT() {
        return java.net.HttpRetryException.class;
    }

}
