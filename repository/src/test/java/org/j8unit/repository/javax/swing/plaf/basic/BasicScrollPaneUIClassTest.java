package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
import javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler;
import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;
import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicScrollPaneUI} (by simply reusing the
 * J8Unit test interface {@link BasicScrollPaneUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicScrollPaneUIClassTest
implements BasicScrollPaneUIClassTests<BasicScrollPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI]

    @Override
    public Class<BasicScrollPaneUI> createNewSUT() {
        return BasicScrollPaneUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicScrollPaneUI#BasicScrollPaneUI() public
     * javax.swing.plaf.basic.BasicScrollPaneUI()}.
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
    public void create_BasicScrollPaneUI()
    throws Exception {
        // create new instance
        final BasicScrollPaneUI sut = new BasicScrollPaneUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicScrollPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicScrollPaneUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicScrollPaneUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ViewportChangeHandler} (by simply
     * reusing the J8Unit test interface {@link ViewportChangeHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ViewportChangeHandlerClassTest
    implements ViewportChangeHandlerClassTests<ViewportChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler]

        @Override
        public Class<ViewportChangeHandler> createNewSUT() {
            return ViewportChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler#ViewportChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public
         * javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)}.
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
        public void create_ViewportChangeHandler_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ViewportChangeHandler sut = null; // = new
                                                    // ViewportChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link VSBChangeListener} (by simply reusing
     * the J8Unit test interface {@link VSBChangeListenerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class VSBChangeListenerClassTest
    implements VSBChangeListenerClassTests<VSBChangeListener> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener]

        @Override
        public Class<VSBChangeListener> createNewSUT() {
            return VSBChangeListener.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener#VSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)}.
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
        public void create_VSBChangeListener_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final VSBChangeListener sut = null; // = new VSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link HSBChangeListener} (by simply reusing
     * the J8Unit test interface {@link HSBChangeListenerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class HSBChangeListenerClassTest
    implements HSBChangeListenerClassTests<HSBChangeListener> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener]

        @Override
        public Class<HSBChangeListener> createNewSUT() {
            return HSBChangeListener.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener#HSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)}.
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
        public void create_HSBChangeListener_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final HSBChangeListener sut = null; // = new HSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface {@link PropertyChangeHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements PropertyChangeHandlerClassTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler]

        @Override
        public Class<PropertyChangeHandler> createNewSUT() {
            return PropertyChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public
         * javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)}.
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
        public void create_PropertyChangeHandler_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PropertyChangeHandler sut = null; // = new
                                                    // PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler]

    }

}
