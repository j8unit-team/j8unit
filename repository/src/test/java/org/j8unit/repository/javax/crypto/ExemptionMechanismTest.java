package org.j8unit.repository.javax.crypto;

import javax.crypto.ExemptionMechanism;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExemptionMechanismTest
implements org.j8unit.repository.javax.crypto.ExemptionMechanismTests<ExemptionMechanism> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.ExemptionMechanism]

    @Override
    public ExemptionMechanism createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.ExemptionMechanism], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.ExemptionMechanism]

}
