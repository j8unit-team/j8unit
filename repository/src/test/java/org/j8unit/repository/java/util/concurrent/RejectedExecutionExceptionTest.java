package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RejectedExecutionExceptionTest
implements org.j8unit.repository.java.util.concurrent.RejectedExecutionExceptionTests<java.util.concurrent.RejectedExecutionException> {

    @Override
    public java.util.concurrent.RejectedExecutionException createNewSUT() {
        return new java.util.concurrent.RejectedExecutionException();
    }

}
