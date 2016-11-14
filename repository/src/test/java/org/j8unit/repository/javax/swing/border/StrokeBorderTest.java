package org.j8unit.repository.javax.swing.border;

import javax.swing.border.StrokeBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StrokeBorder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.border.StrokeBorderTests}).
 */

@RunWith(J8Unit4.class)
public class StrokeBorderTest
implements StrokeBorderTests<StrokeBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.StrokeBorder]

    @Override
    public StrokeBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.border.StrokeBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.StrokeBorder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.StrokeBorder]

}
