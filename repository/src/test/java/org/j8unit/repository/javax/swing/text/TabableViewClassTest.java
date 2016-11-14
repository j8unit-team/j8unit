package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TabableView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TabableView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TabableViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class TabableViewClassTest
implements TabableViewClassTests<TabableView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TabableView]

    @Override
    public Class<TabableView> createNewSUT() {
        return TabableView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.TabableView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TabableView]

}
