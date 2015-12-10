package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeoutExceptionTest
implements org.j8unit.repository.java.util.concurrent.TimeoutExceptionTests<java.util.concurrent.TimeoutException> {

    @Override
    public java.util.concurrent.TimeoutException createNewSUT() {
        return new java.util.concurrent.TimeoutException();
    }

}
