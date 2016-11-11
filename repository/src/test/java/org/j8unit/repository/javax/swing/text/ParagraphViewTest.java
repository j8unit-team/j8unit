package org.j8unit.repository.javax.swing.text;

import javax.swing.text.ParagraphView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ParagraphView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.ParagraphViewTests}).
 */

@RunWith(J8Unit4.class)
public class ParagraphViewTest
implements ParagraphViewTests<ParagraphView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.ParagraphView]

    @Override
    public ParagraphView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.ParagraphView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.ParagraphView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.ParagraphView]

}
