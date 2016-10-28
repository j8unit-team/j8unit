package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKeyFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyFactorySpiTest
implements org.j8unit.repository.javax.crypto.SecretKeyFactorySpiTests<SecretKeyFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SecretKeyFactorySpi]

    @Override
    public SecretKeyFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.SecretKeyFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SecretKeyFactorySpi]

}
