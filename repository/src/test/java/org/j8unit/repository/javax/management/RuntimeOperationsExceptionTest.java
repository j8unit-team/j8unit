package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeOperationsExceptionTest
implements org.j8unit.repository.javax.management.RuntimeOperationsExceptionTests<javax.management.RuntimeOperationsException> {

    @Override
    public javax.management.RuntimeOperationsException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.management.RuntimeOperationsException] available.");
    }

}
