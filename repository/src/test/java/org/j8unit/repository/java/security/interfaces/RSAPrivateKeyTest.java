package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateKeyTest
implements org.j8unit.repository.java.security.interfaces.RSAPrivateKeyTests<RSAPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.RSAPrivateKey]

    @Override
    public RSAPrivateKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.RSAPrivateKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.interfaces.RSAPrivateKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.interfaces.RSAPrivateKey]

}
