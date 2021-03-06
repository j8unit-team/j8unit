package org.j8unit.repository.javax.swing.text;

import javax.swing.text.AsyncBoxView;
import javax.swing.text.AsyncBoxView.ChildLocator;
import javax.swing.text.AsyncBoxView.ChildState;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AsyncBoxView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewClassTests}).
 */
@RunWith(J8Unit4.class)
public class AsyncBoxViewClassTest
implements AsyncBoxViewClassTests<AsyncBoxView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AsyncBoxView]

    @Override
    public Class<AsyncBoxView> createNewSUT() {
        return AsyncBoxView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.AsyncBoxView#AsyncBoxView(javax.swing.text.Element, int) public
     * javax.swing.text.AsyncBoxView(javax.swing.text.Element,int)}.
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
    public void create_AsyncBoxView_Element_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AsyncBoxView sut = null; // = new AsyncBoxView(javax.swing.text.Element, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AsyncBoxView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AsyncBoxView]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ChildState} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewClassTests.ChildStateClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ChildStateClassTest
    implements ChildStateClassTests<ChildState> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AsyncBoxView$ChildState]

        @Override
        public Class<ChildState> createNewSUT() {
            return ChildState.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.AsyncBoxView.ChildState#ChildState(javax.swing.text.AsyncBoxView, javax.swing.text.View)
         * public javax.swing.text.AsyncBoxView$ChildState(javax.swing.text.AsyncBoxView,javax.swing.text.View)}.
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
        public void create_ChildState_AsyncBoxView_View()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ChildState sut = null; // = new ChildState(javax.swing.text.AsyncBoxView, javax.swing.text.View);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AsyncBoxView$ChildState]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AsyncBoxView$ChildState]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ChildLocator} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewClassTests.ChildLocatorClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ChildLocatorClassTest
    implements ChildLocatorClassTests<ChildLocator> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AsyncBoxView$ChildLocator]

        @Override
        public Class<ChildLocator> createNewSUT() {
            return ChildLocator.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.AsyncBoxView.ChildLocator#ChildLocator(javax.swing.text.AsyncBoxView) public
         * javax.swing.text.AsyncBoxView$ChildLocator(javax.swing.text.AsyncBoxView)}.
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
        public void create_ChildLocator_AsyncBoxView()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ChildLocator sut = null; // = new ChildLocator(javax.swing.text.AsyncBoxView);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AsyncBoxView$ChildLocator]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AsyncBoxView$ChildLocator]

    }

}
