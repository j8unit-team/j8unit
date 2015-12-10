package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpRetryExceptionTest
implements org.j8unit.repository.java.net.HttpRetryExceptionTests<java.net.HttpRetryException> {

    @Override
    public java.net.HttpRetryException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.HttpRetryException] available.");
    }

}
