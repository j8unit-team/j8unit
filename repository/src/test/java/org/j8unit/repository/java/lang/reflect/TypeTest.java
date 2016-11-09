package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the J8Unit
 * test interface {@link TypeTests}).
 */

@RunWith(J8Unit4.class)
public class TypeTest
implements TypeTests<Type> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Type]

    @Override
    public Type createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.Type], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.Type]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.Type]

}
