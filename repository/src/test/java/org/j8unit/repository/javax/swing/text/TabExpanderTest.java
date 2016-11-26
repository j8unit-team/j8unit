package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TabExpander;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TabExpander} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TabExpanderTests}).
 */
@RunWith(J8Unit4.class)
public class TabExpanderTest
implements TabExpanderTests<TabExpander> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TabExpander]

    @Override
    public TabExpander createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.TabExpander], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TabExpander]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TabExpander]

}
