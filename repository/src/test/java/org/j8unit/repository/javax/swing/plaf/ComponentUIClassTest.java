package org.j8unit.repository.javax.swing.plaf;

import static org.junit.Assert.fail;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentUIClassTest
implements org.j8unit.repository.javax.swing.plaf.ComponentUIClassTests<ComponentUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.ComponentUI]

    @Override
    public Class<ComponentUI> createNewSUT() {
        return ComponentUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ComponentUI#ComponentUI() public
     * javax.swing.plaf.ComponentUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_ComponentUI()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ComponentUI#createUI(JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.ComponentUI.createUI(javax.swing.JComponent)}.
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
    public void test_createUI_JComponent()
    throws Exception {
        // write some test for {@link ComponentUI#createUI(JComponent)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.ComponentUI]

}
