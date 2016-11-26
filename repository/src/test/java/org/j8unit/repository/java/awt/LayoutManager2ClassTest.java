package org.j8unit.repository.java.awt;

import java.awt.LayoutManager2;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LayoutManager2} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.LayoutManager2ClassTests}).
 */
@RunWith(J8Unit4.class)
public class LayoutManager2ClassTest
implements LayoutManager2ClassTests<LayoutManager2> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.LayoutManager2]

    @Override
    public Class<LayoutManager2> createNewSUT() {
        return LayoutManager2.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.LayoutManager2]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.LayoutManager2]

}
