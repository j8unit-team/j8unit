package org.j8unit.repository.java.security.spec;

import java.security.spec.ECField;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ECField} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.spec.ECFieldTests}).
 */
@RunWith(J8Unit4.class)
public class ECFieldTest
implements ECFieldTests<ECField> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECField]

    @Override
    public ECField createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.spec.ECField], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.ECField]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.ECField]

}
