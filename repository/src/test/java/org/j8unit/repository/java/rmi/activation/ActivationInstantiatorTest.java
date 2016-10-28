package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationInstantiator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationInstantiatorTest
implements org.j8unit.repository.java.rmi.activation.ActivationInstantiatorTests<ActivationInstantiator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

    @Override
    public ActivationInstantiator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.ActivationInstantiator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

}
