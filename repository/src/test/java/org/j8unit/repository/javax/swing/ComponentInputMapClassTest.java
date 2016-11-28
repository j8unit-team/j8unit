package org.j8unit.repository.javax.swing;

import javax.swing.ComponentInputMap;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentInputMap} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ComponentInputMapClassTests}).
 */
@RunWith(J8Unit4.class)
public class ComponentInputMapClassTest
implements ComponentInputMapClassTests<ComponentInputMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ComponentInputMap]

    @Override
    public Class<ComponentInputMap> createNewSUT() {
        return ComponentInputMap.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.ComponentInputMap#ComponentInputMap(javax.swing.JComponent) public
     * javax.swing.ComponentInputMap(javax.swing.JComponent)}.
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
    public void create_ComponentInputMap_JComponent()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ComponentInputMap sut = null; // = new ComponentInputMap(javax.swing.JComponent);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ComponentInputMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ComponentInputMap]

}
