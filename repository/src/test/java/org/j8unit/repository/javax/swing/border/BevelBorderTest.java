package org.j8unit.repository.javax.swing.border;

import javax.swing.border.BevelBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BevelBorder} (by simply reusing the
 * J8Unit test interface {@link BevelBorderTests}).
 */

@RunWith(J8Unit4.class)
public class BevelBorderTest
implements BevelBorderTests<BevelBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.BevelBorder]

    @Override
    public BevelBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.border.BevelBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.BevelBorder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.BevelBorder]

}
