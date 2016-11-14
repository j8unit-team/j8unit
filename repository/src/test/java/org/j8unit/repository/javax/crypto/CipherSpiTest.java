package org.j8unit.repository.javax.crypto;

import javax.crypto.CipherSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CipherSpi} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.CipherSpiTests}).
 */

@RunWith(J8Unit4.class)
public class CipherSpiTest
implements CipherSpiTests<CipherSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.CipherSpi]

    @Override
    public CipherSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.CipherSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.CipherSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.CipherSpi]

}
