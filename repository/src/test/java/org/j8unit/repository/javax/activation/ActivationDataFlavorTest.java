package org.j8unit.repository.javax.activation;

import javax.activation.ActivationDataFlavor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivationDataFlavor} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.activation.ActivationDataFlavorTests}).
 */

@RunWith(J8Unit4.class)
public class ActivationDataFlavorTest
implements ActivationDataFlavorTests<ActivationDataFlavor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.ActivationDataFlavor]

    @Override
    public ActivationDataFlavor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.activation.ActivationDataFlavor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.ActivationDataFlavor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.ActivationDataFlavor]

}
