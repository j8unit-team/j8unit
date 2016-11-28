package org.j8unit.repository.java.awt;

import java.awt.LayoutManager2;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LayoutManager2} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.LayoutManager2Tests}).
 */
@RunWith(J8Unit4.class)
public class LayoutManager2Test
implements LayoutManager2Tests<LayoutManager2> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.LayoutManager2]

    @Override
    public LayoutManager2 createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.LayoutManager2], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.LayoutManager2]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.LayoutManager2]

}
