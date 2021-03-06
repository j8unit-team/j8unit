package org.j8unit.repository.javax.crypto;

import javax.crypto.ExemptionMechanism;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExemptionMechanism} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.crypto.ExemptionMechanismTests}).
 */
@RunWith(J8Unit4.class)
public class ExemptionMechanismTest
implements ExemptionMechanismTests<ExemptionMechanism> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.ExemptionMechanism]

    @Override
    public ExemptionMechanism createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.ExemptionMechanism], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.ExemptionMechanism]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.ExemptionMechanism]

}
