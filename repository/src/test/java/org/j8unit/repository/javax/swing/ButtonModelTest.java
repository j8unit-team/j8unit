package org.j8unit.repository.javax.swing;

import javax.swing.ButtonModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ButtonModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ButtonModelTests}).
 */
@RunWith(J8Unit4.class)
public class ButtonModelTest
implements ButtonModelTests<ButtonModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ButtonModel]

    @Override
    public ButtonModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ButtonModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ButtonModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ButtonModel]

}
