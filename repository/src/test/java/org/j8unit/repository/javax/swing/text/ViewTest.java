package org.j8unit.repository.javax.swing.text;

import javax.swing.text.View;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link View} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.ViewTests}).
 */
@RunWith(J8Unit4.class)
public class ViewTest
implements ViewTests<View> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.View]

    @Override
    public View createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.View], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.View]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.View]

}
