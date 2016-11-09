package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JFormattedTextField} (by simply reusing
 * the J8Unit test interface {@link JFormattedTextFieldClassTests}).
 */

@RunWith(J8Unit4.class)
public class JFormattedTextFieldClassTest
implements JFormattedTextFieldClassTests<JFormattedTextField> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JFormattedTextField]

    @Override
    public Class<JFormattedTextField> createNewSUT() {
        return JFormattedTextField.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory, Object)
     * public
     * javax.swing.JFormattedTextField(javax.swing.JFormattedTextField$AbstractFormatterFactory,java.lang.Object)}.
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
    public void create_JFormattedTextField_AbstractFormatterFactory_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFormattedTextField sut = null; // = new
                                              // JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory,
                                              // Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory)
     * public javax.swing.JFormattedTextField(javax.swing.JFormattedTextField$AbstractFormatterFactory)}.
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
    public void create_JFormattedTextField_AbstractFormatterFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFormattedTextField sut = null; // = new
                                              // JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatter)
     * public javax.swing.JFormattedTextField(javax.swing.JFormattedTextField$AbstractFormatter)}.
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
    public void create_JFormattedTextField_AbstractFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFormattedTextField sut = null; // = new
                                              // JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatter);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(java.text.Format) public
     * javax.swing.JFormattedTextField(java.text.Format)}.
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
    public void create_JFormattedTextField_Format()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFormattedTextField sut = null; // = new JFormattedTextField(java.text.Format);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(Object) public
     * javax.swing.JFormattedTextField(java.lang.Object)}.
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
    public void create_JFormattedTextField_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JFormattedTextField sut = null; // = new JFormattedTextField(Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JFormattedTextField#JFormattedTextField() public javax.swing.JFormattedTextField()}.
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
    public void create_JFormattedTextField()
    throws Exception {
        // create new instance
        final JFormattedTextField sut = new JFormattedTextField();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JFormattedTextField]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JFormattedTextField]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractFormatter} (by simply reusing
     * the J8Unit test interface {@link AbstractFormatterClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AbstractFormatterClassTest
    implements AbstractFormatterClassTests<AbstractFormatter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JFormattedTextField$AbstractFormatter]

        @Override
        public Class<AbstractFormatter> createNewSUT() {
            return AbstractFormatter.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JFormattedTextField.AbstractFormatter#AbstractFormatter() public
         * javax.swing.JFormattedTextField$AbstractFormatter()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_AbstractFormatter()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JFormattedTextField$AbstractFormatter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JFormattedTextField$AbstractFormatter]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractFormatterFactory} (by simply
     * reusing the J8Unit test interface {@link AbstractFormatterFactoryClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AbstractFormatterFactoryClassTest
    implements AbstractFormatterFactoryClassTests<AbstractFormatterFactory> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JFormattedTextField$AbstractFormatterFactory]

        @Override
        public Class<AbstractFormatterFactory> createNewSUT() {
            return AbstractFormatterFactory.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JFormattedTextField.AbstractFormatterFactory#AbstractFormatterFactory() public
         * javax.swing.JFormattedTextField$AbstractFormatterFactory()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_AbstractFormatterFactory()
        throws Exception {
            Assert.fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JFormattedTextField$AbstractFormatterFactory]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JFormattedTextField$AbstractFormatterFactory]

    }

}
