package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TabStop;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TabStop} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TabStopTests}).
 */
@RunWith(J8Unit4.class)
public class TabStopTest
implements TabStopTests<TabStop> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TabStop]

    @Override
    public TabStop createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.TabStop], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TabStop]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TabStop]

}
