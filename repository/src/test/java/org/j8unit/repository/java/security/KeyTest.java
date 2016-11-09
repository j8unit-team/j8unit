package org.j8unit.repository.java.security;

import java.security.Key;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Key} (by simply reusing the J8Unit
 * test interface {@link KeyTests}).
 */

@RunWith(J8Unit4.class)
public class KeyTest
implements KeyTests<Key> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Key]

    @Override
    public Key createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Key], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Key]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Key]

}
