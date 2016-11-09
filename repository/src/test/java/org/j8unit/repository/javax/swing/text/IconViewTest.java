package org.j8unit.repository.javax.swing.text;

import javax.swing.text.IconView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IconView} (by simply reusing the
 * J8Unit test interface {@link IconViewTests}).
 */

@RunWith(J8Unit4.class)
public class IconViewTest
implements IconViewTests<IconView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.IconView]

    @Override
    public IconView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.IconView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.IconView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.IconView]

}
