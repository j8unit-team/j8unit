package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicMenuUI;
import javax.swing.plaf.basic.BasicMenuUI.ChangeHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicMenuUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUIClassTests<BasicMenuUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicMenuUI]

    @Override
    public Class<BasicMenuUI> createNewSUT() {
        return BasicMenuUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicMenuUI#BasicMenuUI() public javax.swing.plaf.basic.BasicMenuUI()}.
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
    public void create_BasicMenuUI()
    throws Exception {
        // create new instance
        final BasicMenuUI sut = new BasicMenuUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicMenuUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicMenuUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicMenuUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicMenuUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicMenuUI]

    @RunWith(J8Unit4.class)
    public static class ChangeHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUIClassTests.ChangeHandlerClassTests<ChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicMenuUI$ChangeHandler]

        @Override
        public Class<ChangeHandler> createNewSUT() {
            return ChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#ChangeHandler(javax.swing.plaf.basic.BasicMenuUI, javax.swing.JMenu, javax.swing.plaf.basic.BasicMenuUI)
         * public
         * javax.swing.plaf.basic.BasicMenuUI$ChangeHandler(javax.swing.plaf.basic.BasicMenuUI,javax.swing.JMenu,javax.swing.plaf.basic.BasicMenuUI)}.
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
        public void create_ChangeHandler_BasicMenuUI_JMenu_BasicMenuUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ChangeHandler sut = null; // = new ChangeHandler(javax.swing.plaf.basic.BasicMenuUI,
                                            // javax.swing.JMenu, javax.swing.plaf.basic.BasicMenuUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicMenuUI$ChangeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicMenuUI$ChangeHandler]

    }

}
