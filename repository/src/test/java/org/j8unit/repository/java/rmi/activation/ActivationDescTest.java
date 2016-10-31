package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationDesc;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationDescTest
implements org.j8unit.repository.java.rmi.activation.ActivationDescTests<ActivationDesc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationDesc]

    @Override
    public ActivationDesc createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivationDesc], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationDesc]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationDesc]

}
