package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeErrorExceptionTest
implements org.j8unit.repository.javax.management.RuntimeErrorExceptionTests<javax.management.RuntimeErrorException> {

    @Override
    public javax.management.RuntimeErrorException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.RuntimeErrorException] available.");
    }

}
