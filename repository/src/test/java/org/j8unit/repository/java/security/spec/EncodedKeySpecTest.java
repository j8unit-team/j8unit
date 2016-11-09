package org.j8unit.repository.java.security.spec;

import java.security.spec.EncodedKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EncodedKeySpec} (by simply reusing
 * the J8Unit test interface {@link EncodedKeySpecTests}).
 */

@RunWith(J8Unit4.class)
public class EncodedKeySpecTest
implements EncodedKeySpecTests<EncodedKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.EncodedKeySpec]

    @Override
    public EncodedKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.spec.EncodedKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.EncodedKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.EncodedKeySpec]

}
