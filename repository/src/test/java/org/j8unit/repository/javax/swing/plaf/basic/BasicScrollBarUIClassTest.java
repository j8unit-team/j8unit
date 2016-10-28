package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicScrollBarUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUIClassTests<BasicScrollBarUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicScrollBarUI]

    @Override
    public Class<BasicScrollBarUI> createNewSUT() {
        return BasicScrollBarUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicScrollBarUI#BasicScrollBarUI() public
     * javax.swing.plaf.basic.BasicScrollBarUI()}.
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
    public void create_BasicScrollBarUI()
    throws Exception {
        // create new instance
        final BasicScrollBarUI sut = new BasicScrollBarUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicScrollBarUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicScrollBarUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicScrollBarUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicScrollBarUI]

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUIClassTests.PropertyChangeHandlerClassTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicScrollBarUI$PropertyChangeHandler]

        @Override
        public Class<PropertyChangeHandler> createNewSUT() {
            return PropertyChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollBarUI)
         * public
         * javax.swing.plaf.basic.BasicScrollBarUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollBarUI)}.
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
        public void create_PropertyChangeHandler_BasicScrollBarUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PropertyChangeHandler sut = null; // = new
                                                    // PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollBarUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicScrollBarUI$PropertyChangeHandler]

    }

}
