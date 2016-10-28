package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.UnknownObjectException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownObjectExceptionTest
implements org.j8unit.repository.java.rmi.activation.UnknownObjectExceptionTests<UnknownObjectException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.UnknownObjectException]

    @Override
    public UnknownObjectException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.UnknownObjectException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.UnknownObjectException]

}
