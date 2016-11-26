package org.j8unit.repository.javax.swing.border;

import javax.swing.border.LineBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LineBorder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.border.LineBorderTests}).
 */
@RunWith(J8Unit4.class)
public class LineBorderTest
implements LineBorderTests<LineBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.LineBorder]

    @Override
    public LineBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.border.LineBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.LineBorder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.LineBorder]

}
