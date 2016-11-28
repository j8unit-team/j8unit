package org.j8unit.repository.javax.swing.border;

import javax.swing.border.TitledBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TitledBorder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.border.TitledBorderTests}).
 */
@RunWith(J8Unit4.class)
public class TitledBorderTest
implements TitledBorderTests<TitledBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.TitledBorder]

    @Override
    public TitledBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.border.TitledBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.TitledBorder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.TitledBorder]

}
