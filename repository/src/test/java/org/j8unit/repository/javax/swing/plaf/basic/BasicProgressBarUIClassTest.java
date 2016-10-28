package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;
import javax.swing.plaf.basic.BasicProgressBarUI.ChangeHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicProgressBarUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicProgressBarUIClassTests<BasicProgressBarUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicProgressBarUI]

    @Override
    public Class<BasicProgressBarUI> createNewSUT() {
        return BasicProgressBarUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link BasicProgressBarUI#BasicProgressBarUI() public
     * javax.swing.plaf.basic.BasicProgressBarUI()}.
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
    public void create_BasicProgressBarUI()
    throws Exception {
        // create new instance
        final BasicProgressBarUI sut = new BasicProgressBarUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link BasicProgressBarUI#createUI(JComponent) public
     * static javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicProgressBarUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link BasicProgressBarUI#createUI(JComponent)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicProgressBarUI]

    @RunWith(J8Unit4.class)
    public static class ChangeHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicProgressBarUIClassTests.ChangeHandlerClassTests<ChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicProgressBarUI$ChangeHandler]

        @Override
        public Class<ChangeHandler> createNewSUT() {
            return ChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link ChangeHandler#ChangeHandler(BasicProgressBarUI) public
         * javax.swing.plaf.basic.BasicProgressBarUI$ChangeHandler(javax.swing.plaf.basic.BasicProgressBarUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ChangeHandler_BasicProgressBarUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ChangeHandler sut = null; // = new ChangeHandler(BasicProgressBarUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicProgressBarUI$ChangeHandler]

    }

}
