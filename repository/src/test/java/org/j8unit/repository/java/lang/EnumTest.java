package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Enum} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.EnumTests}).
 */

@RunWith(J8Unit4.class)
public class EnumTest<E extends Enum<E>>
implements EnumTests<Enum<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Enum]

    @Override
    public Enum<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Enum], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Enum]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Enum]

}
