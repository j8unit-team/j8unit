package org.j8unit.repository.java.net;

import java.net.HttpRetryException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpRetryExceptionTest
implements org.j8unit.repository.java.net.HttpRetryExceptionTests<HttpRetryException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.HttpRetryException]

    @Override
    public HttpRetryException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.HttpRetryException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.HttpRetryException]

}
