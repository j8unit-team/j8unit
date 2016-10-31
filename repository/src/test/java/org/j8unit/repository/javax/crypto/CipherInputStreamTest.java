package org.j8unit.repository.javax.crypto;

import javax.crypto.CipherInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherInputStreamTest
implements org.j8unit.repository.javax.crypto.CipherInputStreamTests<CipherInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.CipherInputStream]

    @Override
    public CipherInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.CipherInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.CipherInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.CipherInputStream]

}
