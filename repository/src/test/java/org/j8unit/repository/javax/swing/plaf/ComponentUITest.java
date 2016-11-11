package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.ComponentUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ComponentUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.ComponentUITests}).
 */

@RunWith(J8Unit4.class)
public class ComponentUITest
implements ComponentUITests<ComponentUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.ComponentUI]

    @Override
    public ComponentUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.ComponentUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.ComponentUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.ComponentUI]

}
