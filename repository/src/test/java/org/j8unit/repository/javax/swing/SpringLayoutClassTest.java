package org.j8unit.repository.javax.swing;

import javax.swing.SpringLayout;
import javax.swing.SpringLayout.Constraints;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SpringLayout} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.SpringLayoutClassTests}).
 */

@RunWith(J8Unit4.class)
public class SpringLayoutClassTest
implements SpringLayoutClassTests<SpringLayout> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SpringLayout]

    @Override
    public Class<SpringLayout> createNewSUT() {
        return SpringLayout.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.SpringLayout#SpringLayout() public
     * javax.swing.SpringLayout()}.
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
    public void create_SpringLayout()
    throws Exception {
        // create new instance
        final SpringLayout sut = new SpringLayout();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SpringLayout]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SpringLayout]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Constraints} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.SpringLayoutClassTests.ConstraintsClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ConstraintsClassTest
    implements ConstraintsClassTests<Constraints> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SpringLayout$Constraints]

        @Override
        public Class<Constraints> createNewSUT() {
            return Constraints.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.SpringLayout.Constraints#Constraints(javax.swing.Spring, javax.swing.Spring) public
         * javax.swing.SpringLayout$Constraints(javax.swing.Spring,javax.swing.Spring)}.
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
        public void create_Constraints_Spring_Spring()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Constraints sut = null; // = new Constraints(javax.swing.Spring, javax.swing.Spring);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.SpringLayout.Constraints#Constraints(javax.swing.Spring, javax.swing.Spring, javax.swing.Spring, javax.swing.Spring)
         * public
         * javax.swing.SpringLayout$Constraints(javax.swing.Spring,javax.swing.Spring,javax.swing.Spring,javax.swing.Spring)}.
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
        public void create_Constraints_Spring_Spring_Spring_Spring()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Constraints sut = null; // = new Constraints(javax.swing.Spring, javax.swing.Spring,
                                          // javax.swing.Spring, javax.swing.Spring);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.SpringLayout.Constraints#Constraints(java.awt.Component) public
         * javax.swing.SpringLayout$Constraints(java.awt.Component)}.
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
        public void create_Constraints_Component()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Constraints sut = null; // = new Constraints(java.awt.Component);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.SpringLayout.Constraints#Constraints() public javax.swing.SpringLayout$Constraints()}.
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
        public void create_Constraints()
        throws Exception {
            // create new instance
            final Constraints sut = new Constraints();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SpringLayout$Constraints]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SpringLayout$Constraints]

    }

}
