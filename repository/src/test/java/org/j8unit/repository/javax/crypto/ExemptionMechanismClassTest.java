package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExemptionMechanismClassTest
implements org.j8unit.repository.javax.crypto.ExemptionMechanismClassTests<javax.crypto.ExemptionMechanism> {

    @Override
    public Class<javax.crypto.ExemptionMechanism> createNewSUT() {
        return javax.crypto.ExemptionMechanism.class;
    }

}
