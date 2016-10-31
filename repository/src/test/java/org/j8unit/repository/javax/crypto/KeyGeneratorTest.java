package org.j8unit.repository.javax.crypto;

import javax.crypto.KeyGenerator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyGeneratorTest
implements org.j8unit.repository.javax.crypto.KeyGeneratorTests<KeyGenerator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.KeyGenerator]

    @Override
    public KeyGenerator createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.KeyGenerator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.KeyGenerator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.KeyGenerator]

}
