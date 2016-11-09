package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicPopupMenuSeparatorUI} (by simply
 * reusing the J8Unit test interface {@link BasicPopupMenuSeparatorUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicPopupMenuSeparatorUIClassTest
implements BasicPopupMenuSeparatorUIClassTests<BasicPopupMenuSeparatorUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicPopupMenuSeparatorUI]

    @Override
    public Class<BasicPopupMenuSeparatorUI> createNewSUT() {
        return BasicPopupMenuSeparatorUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicPopupMenuSeparatorUI#BasicPopupMenuSeparatorUI() public
     * javax.swing.plaf.basic.BasicPopupMenuSeparatorUI()}.
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
    public void create_BasicPopupMenuSeparatorUI()
    throws Exception {
        // create new instance
        final BasicPopupMenuSeparatorUI sut = new BasicPopupMenuSeparatorUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicPopupMenuSeparatorUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicPopupMenuSeparatorUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicPopupMenuSeparatorUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicPopupMenuSeparatorUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicPopupMenuSeparatorUI]

}
