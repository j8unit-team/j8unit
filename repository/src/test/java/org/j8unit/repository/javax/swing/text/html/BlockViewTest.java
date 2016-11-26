package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.BlockView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BlockView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.BlockViewTests}).
 */
@RunWith(J8Unit4.class)
public class BlockViewTest
implements BlockViewTests<BlockView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.BlockView]

    @Override
    public BlockView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.BlockView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.BlockView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.BlockView]

}
