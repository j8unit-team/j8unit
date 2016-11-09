package org.j8unit.repository.java.security;

import java.security.KeyFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyFactory} (by simply reusing the
 * J8Unit test interface {@link KeyFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class KeyFactoryTest
implements KeyFactoryTests<KeyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyFactory]

    @Override
    public KeyFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyFactory]

}
