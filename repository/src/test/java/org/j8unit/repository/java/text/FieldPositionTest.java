package org.j8unit.repository.java.text;

import java.text.FieldPosition;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FieldPosition} (by simply reusing the
 * J8Unit test interface {@link FieldPositionTests}).
 */

@RunWith(J8Unit4.class)
public class FieldPositionTest
implements FieldPositionTests<FieldPosition> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.FieldPosition]

    @Override
    public FieldPosition createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.FieldPosition], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.FieldPosition]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.FieldPosition]

}
