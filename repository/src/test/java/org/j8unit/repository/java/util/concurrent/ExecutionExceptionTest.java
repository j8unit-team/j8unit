package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutionExceptionTest
implements org.j8unit.repository.java.util.concurrent.ExecutionExceptionTests<java.util.concurrent.ExecutionException> {

    @Override
    public java.util.concurrent.ExecutionException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.ExecutionException] available.");
    }

}
