package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TextAction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextAction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.TextActionTests}).
 */
@RunWith(J8Unit4.class)
public class TextActionTest
implements TextActionTests<TextAction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.TextAction]

    @Override
    public TextAction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.TextAction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.TextAction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.TextAction]

}
