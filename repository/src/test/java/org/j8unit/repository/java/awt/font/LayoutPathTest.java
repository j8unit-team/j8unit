package org.j8unit.repository.java.awt.font;

import java.awt.font.LayoutPath;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LayoutPath} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.LayoutPathTests}).
 */
@RunWith(J8Unit4.class)
public class LayoutPathTest
implements LayoutPathTests<LayoutPath> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.LayoutPath]

    @Override
    public LayoutPath createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.font.LayoutPath], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.LayoutPath]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.LayoutPath]

}
