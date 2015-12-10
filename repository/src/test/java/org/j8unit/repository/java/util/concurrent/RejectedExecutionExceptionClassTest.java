package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RejectedExecutionExceptionClassTest
implements org.j8unit.repository.java.util.concurrent.RejectedExecutionExceptionClassTests<java.util.concurrent.RejectedExecutionException> {

    @Override
    public Class<java.util.concurrent.RejectedExecutionException> createNewSUT() {
        return java.util.concurrent.RejectedExecutionException.class;
    }

}
