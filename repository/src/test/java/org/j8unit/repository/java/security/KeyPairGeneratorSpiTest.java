package org.j8unit.repository.java.security;

import java.security.KeyPairGeneratorSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyPairGeneratorSpiTest
implements org.j8unit.repository.java.security.KeyPairGeneratorSpiTests<KeyPairGeneratorSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyPairGeneratorSpi]

    @Override
    public KeyPairGeneratorSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyPairGeneratorSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyPairGeneratorSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyPairGeneratorSpi]

}
