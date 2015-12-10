package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExemptionMechanismSpiClassTest
implements org.j8unit.repository.javax.crypto.ExemptionMechanismSpiClassTests<javax.crypto.ExemptionMechanismSpi> {

    @Override
    public Class<javax.crypto.ExemptionMechanismSpi> createNewSUT() {
        return javax.crypto.ExemptionMechanismSpi.class;
    }

}
