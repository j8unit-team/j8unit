package org.j8unit.repository.javax.swing;

import javax.swing.Action;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Action} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.ActionTests}).
 */
@RunWith(J8Unit4.class)
public class ActionTest
implements ActionTests<Action> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Action]

    @Override
    public Action createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.Action], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Action]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Action]

}
