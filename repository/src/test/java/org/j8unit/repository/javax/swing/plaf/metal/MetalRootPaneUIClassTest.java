package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalRootPaneUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MetalRootPaneUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.metal.MetalRootPaneUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class MetalRootPaneUIClassTest
implements MetalRootPaneUIClassTests<MetalRootPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalRootPaneUI]

    @Override
    public Class<MetalRootPaneUI> createNewSUT() {
        return MetalRootPaneUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.metal.MetalRootPaneUI#MetalRootPaneUI() public javax.swing.plaf.metal.MetalRootPaneUI()}.
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
    public void create_MetalRootPaneUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MetalRootPaneUI sut = new MetalRootPaneUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.metal.MetalRootPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.metal.MetalRootPaneUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.metal.MetalRootPaneUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalRootPaneUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalRootPaneUI]

}
