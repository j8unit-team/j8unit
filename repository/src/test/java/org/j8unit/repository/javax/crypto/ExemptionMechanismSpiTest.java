package org.j8unit.repository.javax.crypto;

import javax.crypto.ExemptionMechanismSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExemptionMechanismSpi} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.crypto.ExemptionMechanismSpiTests}).
 */
@RunWith(J8Unit4.class)
public class ExemptionMechanismSpiTest
implements ExemptionMechanismSpiTests<ExemptionMechanismSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.ExemptionMechanismSpi]

    @Override
    public ExemptionMechanismSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.ExemptionMechanismSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.ExemptionMechanismSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.ExemptionMechanismSpi]

}
