package org.j8unit.repository.javax.swing.plaf.multi;

import javax.swing.plaf.multi.MultiScrollBarUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MultiScrollBarUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.multi.MultiScrollBarUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class MultiScrollBarUIClassTest
implements MultiScrollBarUIClassTests<MultiScrollBarUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.multi.MultiScrollBarUI]

    @Override
    public Class<MultiScrollBarUI> createNewSUT() {
        return MultiScrollBarUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.multi.MultiScrollBarUI#MultiScrollBarUI() public
     * javax.swing.plaf.multi.MultiScrollBarUI()}.
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
    public void create_MultiScrollBarUI()
    throws Exception {
        // create new instance
        final MultiScrollBarUI sut = new MultiScrollBarUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.multi.MultiScrollBarUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.multi.MultiScrollBarUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.multi.MultiScrollBarUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.multi.MultiScrollBarUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.multi.MultiScrollBarUI]

}
