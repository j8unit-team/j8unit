package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKeyFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SecretKeyFactory} (by simply reusing
 * the J8Unit test interface {@link SecretKeyFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class SecretKeyFactoryTest
implements SecretKeyFactoryTests<SecretKeyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SecretKeyFactory]

    @Override
    public SecretKeyFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.SecretKeyFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.SecretKeyFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.SecretKeyFactory]

}
