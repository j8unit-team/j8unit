package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPrivateKeyTest
implements org.j8unit.repository.java.security.interfaces.DSAPrivateKeyTests<DSAPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.DSAPrivateKey]

    @Override
    public DSAPrivateKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.DSAPrivateKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.DSAPrivateKey]

}
