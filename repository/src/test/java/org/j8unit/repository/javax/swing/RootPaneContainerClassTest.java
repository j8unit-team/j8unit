package org.j8unit.repository.javax.swing;

import javax.swing.RootPaneContainer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RootPaneContainer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.RootPaneContainerClassTests}).
 */
@RunWith(J8Unit4.class)
public class RootPaneContainerClassTest
implements RootPaneContainerClassTests<RootPaneContainer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RootPaneContainer]

    @Override
    public Class<RootPaneContainer> createNewSUT() {
        return RootPaneContainer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RootPaneContainer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RootPaneContainer]

}
