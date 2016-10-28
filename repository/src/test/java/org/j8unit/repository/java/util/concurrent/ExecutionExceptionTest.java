package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutionException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutionExceptionTest
implements org.j8unit.repository.java.util.concurrent.ExecutionExceptionTests<ExecutionException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ExecutionException]

    @Override
    public ExecutionException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ExecutionException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ExecutionException]

}
