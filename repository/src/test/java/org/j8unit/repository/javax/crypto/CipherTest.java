package org.j8unit.repository.javax.crypto;

import javax.crypto.Cipher;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherTest
implements org.j8unit.repository.javax.crypto.CipherTests<Cipher> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.Cipher]

    @Override
    public Cipher createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.Cipher], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.Cipher]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.Cipher]

}
