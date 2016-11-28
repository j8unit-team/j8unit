package org.j8unit.repository.javax.swing.border;

import javax.swing.border.Border;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Border} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.border.BorderTests}).
 */
@RunWith(J8Unit4.class)
public class BorderTest
implements BorderTests<Border> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.Border]

    @Override
    public Border createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.border.Border], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.Border]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.Border]

}
