package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TabSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TabSet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.TabSetTests}).
 */
@RunWith(J8Unit4.class)
public class TabSetTest
implements TabSetTests<TabSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TabSet]

    @Override
    public TabSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.TabSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TabSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TabSet]

}
