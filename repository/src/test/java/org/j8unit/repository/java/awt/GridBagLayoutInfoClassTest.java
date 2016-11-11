package org.j8unit.repository.java.awt;

import java.awt.GridBagLayoutInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GridBagLayoutInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.GridBagLayoutInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class GridBagLayoutInfoClassTest
implements GridBagLayoutInfoClassTests<GridBagLayoutInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.GridBagLayoutInfo]

    @Override
    public Class<GridBagLayoutInfo> createNewSUT() {
        return GridBagLayoutInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.GridBagLayoutInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.GridBagLayoutInfo]

}
