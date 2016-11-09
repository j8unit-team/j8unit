package org.j8unit.repository.javax.crypto;

import javax.crypto.CipherInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CipherInputStream} (by simply reusing
 * the J8Unit test interface {@link CipherInputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class CipherInputStreamTest
implements CipherInputStreamTests<CipherInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.CipherInputStream]

    @Override
    public CipherInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.CipherInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.CipherInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.CipherInputStream]

}
