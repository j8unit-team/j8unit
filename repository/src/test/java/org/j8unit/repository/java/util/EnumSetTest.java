package org.j8unit.repository.java.util;

import java.util.EnumSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EnumSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.EnumSetTests}).
 */

@RunWith(J8Unit4.class)
public class EnumSetTest<E extends Enum<E>>
implements EnumSetTests<EnumSet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.EnumSet]

    @Override
    public EnumSet<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.EnumSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.EnumSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.EnumSet]

}
