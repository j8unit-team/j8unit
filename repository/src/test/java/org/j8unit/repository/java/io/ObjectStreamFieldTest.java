package org.j8unit.repository.java.io;

import java.io.ObjectStreamField;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectStreamField} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.io.ObjectStreamFieldTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectStreamFieldTest
implements ObjectStreamFieldTests<ObjectStreamField> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectStreamField]

    @Override
    public ObjectStreamField createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.ObjectStreamField], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectStreamField]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectStreamField]

}
