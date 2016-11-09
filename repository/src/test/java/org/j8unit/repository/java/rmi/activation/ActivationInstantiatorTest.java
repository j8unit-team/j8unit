package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationInstantiator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivationInstantiator} (by simply
 * reusing the J8Unit test interface {@link ActivationInstantiatorTests}).
 */

@RunWith(J8Unit4.class)
public class ActivationInstantiatorTest
implements ActivationInstantiatorTests<ActivationInstantiator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

    @Override
    public ActivationInstantiator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.ActivationInstantiator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

}
