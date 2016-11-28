package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TabExpander;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TabExpander} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TabExpanderClassTests}).
 */
@RunWith(J8Unit4.class)
public class TabExpanderClassTest
implements TabExpanderClassTests<TabExpander> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TabExpander]

    @Override
    public Class<TabExpander> createNewSUT() {
        return TabExpander.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.TabExpander]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TabExpander]

}
