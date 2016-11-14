package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.WildcardType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WildcardType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.WildcardTypeTests}).
 */

@RunWith(J8Unit4.class)
public class WildcardTypeTest
implements WildcardTypeTests<WildcardType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.WildcardType]

    @Override
    public WildcardType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.WildcardType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.WildcardType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.WildcardType]

}
