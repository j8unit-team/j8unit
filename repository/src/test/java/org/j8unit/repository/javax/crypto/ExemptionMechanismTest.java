package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExemptionMechanismTest
implements org.j8unit.repository.javax.crypto.ExemptionMechanismTests<javax.crypto.ExemptionMechanism> {

    @Override
    public javax.crypto.ExemptionMechanism createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.crypto.ExemptionMechanism] available.");
    }

}
