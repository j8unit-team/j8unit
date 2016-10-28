package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPublicKeyTest
implements org.j8unit.repository.java.security.interfaces.RSAPublicKeyTests<RSAPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.RSAPublicKey]

    @Override
    public RSAPublicKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.RSAPublicKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.RSAPublicKey]

}
