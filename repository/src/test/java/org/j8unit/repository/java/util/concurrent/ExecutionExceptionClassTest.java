package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutionExceptionClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutionExceptionClassTests<java.util.concurrent.ExecutionException> {

    @Override
    public Class<java.util.concurrent.ExecutionException> createNewSUT() {
        return java.util.concurrent.ExecutionException.class;
    }

}
