package org.j8unit.repository.javax.swing.border;

import javax.swing.border.MatteBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MatteBorder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.border.MatteBorderTests}).
 */

@RunWith(J8Unit4.class)
public class MatteBorderTest
implements MatteBorderTests<MatteBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.MatteBorder]

    @Override
    public MatteBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.border.MatteBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.MatteBorder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.MatteBorder]

}
