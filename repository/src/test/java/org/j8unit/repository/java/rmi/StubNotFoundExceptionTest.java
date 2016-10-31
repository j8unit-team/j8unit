package org.j8unit.repository.java.rmi;

import java.rmi.StubNotFoundException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StubNotFoundExceptionTest
implements org.j8unit.repository.java.rmi.StubNotFoundExceptionTests<StubNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.StubNotFoundException]

    @Override
    public StubNotFoundException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.StubNotFoundException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.StubNotFoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.StubNotFoundException]

}
