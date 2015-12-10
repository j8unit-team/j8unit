package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExemptionMechanismExceptionTest
implements org.j8unit.repository.javax.crypto.ExemptionMechanismExceptionTests<javax.crypto.ExemptionMechanismException> {

    @Override
    public javax.crypto.ExemptionMechanismException createNewSUT() {
        return new javax.crypto.ExemptionMechanismException();
    }

}
