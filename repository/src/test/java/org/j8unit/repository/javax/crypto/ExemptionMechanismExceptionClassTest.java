package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExemptionMechanismExceptionClassTest
implements org.j8unit.repository.javax.crypto.ExemptionMechanismExceptionClassTests<javax.crypto.ExemptionMechanismException> {

    @Override
    public Class<javax.crypto.ExemptionMechanismException> createNewSUT() {
        return javax.crypto.ExemptionMechanismException.class;
    }

}
