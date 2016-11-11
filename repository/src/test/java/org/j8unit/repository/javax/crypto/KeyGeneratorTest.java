package org.j8unit.repository.javax.crypto;

import javax.crypto.KeyGenerator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyGenerator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.KeyGeneratorTests}).
 */

@RunWith(J8Unit4.class)
public class KeyGeneratorTest
implements KeyGeneratorTests<KeyGenerator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.KeyGenerator]

    @Override
    public KeyGenerator createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.KeyGenerator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.KeyGenerator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.KeyGenerator]

}
