package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPublicKeyTest
implements org.j8unit.repository.java.security.interfaces.DSAPublicKeyTests<DSAPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.DSAPublicKey]

    @Override
    public DSAPublicKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.DSAPublicKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.interfaces.DSAPublicKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.interfaces.DSAPublicKey]

}
