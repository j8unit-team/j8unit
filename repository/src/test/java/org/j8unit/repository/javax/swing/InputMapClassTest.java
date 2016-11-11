package org.j8unit.repository.javax.swing;

import javax.swing.InputMap;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputMap} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.InputMapClassTests}).
 */

@RunWith(J8Unit4.class)
public class InputMapClassTest
implements InputMapClassTests<InputMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.InputMap]

    @Override
    public Class<InputMap> createNewSUT() {
        return InputMap.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.InputMap#InputMap() public
     * javax.swing.InputMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_InputMap()
    throws Exception {
        // create new instance
        final InputMap sut = new InputMap();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.InputMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.InputMap]

}
