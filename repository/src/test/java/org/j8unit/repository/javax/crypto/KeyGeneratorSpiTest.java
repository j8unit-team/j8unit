package org.j8unit.repository.javax.crypto;

import javax.crypto.KeyGeneratorSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyGeneratorSpiTest
implements org.j8unit.repository.javax.crypto.KeyGeneratorSpiTests<KeyGeneratorSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.KeyGeneratorSpi]

    @Override
    public KeyGeneratorSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.KeyGeneratorSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.KeyGeneratorSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.KeyGeneratorSpi]

}
