package org.j8unit.repository.java.awt;

import java.awt.GridBagLayoutInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GridBagLayoutInfo} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.GridBagLayoutInfoTests}).
 */

@RunWith(J8Unit4.class)
public class GridBagLayoutInfoTest
implements GridBagLayoutInfoTests<GridBagLayoutInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GridBagLayoutInfo]

    @Override
    public GridBagLayoutInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.GridBagLayoutInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GridBagLayoutInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GridBagLayoutInfo]

}
