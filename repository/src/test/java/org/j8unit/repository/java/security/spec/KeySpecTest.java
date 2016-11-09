package org.j8unit.repository.java.security.spec;

import java.security.spec.KeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeySpec} (by simply reusing the
 * J8Unit test interface {@link KeySpecTests}).
 */

@RunWith(J8Unit4.class)
public class KeySpecTest
implements KeySpecTests<KeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.KeySpec]

    @Override
    public KeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.spec.KeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.KeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.KeySpec]

}
