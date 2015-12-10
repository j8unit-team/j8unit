package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JFormattedTextField class javax.swing.JFormattedTextField}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JFormattedTextFieldTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.JFormattedTextFieldTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JFormattedTextFieldClassTests<SUT extends javax.swing.JFormattedTextField>
extends org.j8unit.repository.javax.swing.JTextFieldClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.JFormattedTextField$AbstractFormatter class
     * javax.swing.JFormattedTextField$AbstractFormatter}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JFormattedTextFieldTests.AbstractFormatterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JFormattedTextFieldTests.AbstractFormatterTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractFormatterClassTests<SUT extends javax.swing.JFormattedTextField.AbstractFormatter>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JFormattedTextField.AbstractFormatter#AbstractFormatter() public
         * javax.swing.JFormattedTextField$AbstractFormatter()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AbstractFormatter()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JFormattedTextField.AbstractFormatter sut = null; // = new AbstractFormatter();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JFormattedTextField.AbstractFormatter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.JFormattedTextField$AbstractFormatterFactory class
     * javax.swing.JFormattedTextField$AbstractFormatterFactory}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JFormattedTextFieldTests.AbstractFormatterFactoryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JFormattedTextFieldTests.AbstractFormatterFactoryTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractFormatterFactoryClassTests<SUT extends javax.swing.JFormattedTextField.AbstractFormatterFactory>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.JFormattedTextField.AbstractFormatterFactory#AbstractFormatterFactory()
         * public javax.swing.JFormattedTextField$AbstractFormatterFactory()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AbstractFormatterFactory()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JFormattedTextField.AbstractFormatterFactory sut = null; // = new
                                                                                       // AbstractFormatterFactory();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JFormattedTextField.AbstractFormatterFactory.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.JFormattedTextField#JFormattedTextField() public
     * javax.swing.JFormattedTextField()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFormattedTextField()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFormattedTextField sut = null; // = new JFormattedTextField();
    }

    /**
     * Test method for
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatter)
     * public javax.swing.JFormattedTextField(javax.swing.JFormattedTextField$AbstractFormatter)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFormattedTextField_AbstractFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFormattedTextField sut = null; // = new
                                                          // JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatter);
    }

    /**
     * Test method for
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory)
     * public javax.swing.JFormattedTextField(javax.swing.JFormattedTextField$AbstractFormatterFactory)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFormattedTextField_AbstractFormatterFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFormattedTextField sut = null; // = new
                                                          // JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory);
    }

    /**
     * Test method for
     * {@link javax.swing.JFormattedTextField#JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory,java.lang.Object)
     * public
     * javax.swing.JFormattedTextField(javax.swing.JFormattedTextField$AbstractFormatterFactory,java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFormattedTextField_AbstractFormatterFactory_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFormattedTextField sut = null; // = new
                                                          // JFormattedTextField(javax.swing.JFormattedTextField.AbstractFormatterFactory,java.lang.Object);
    }

    /**
     * Test method for {@link javax.swing.JFormattedTextField#JFormattedTextField(java.text.Format) public
     * javax.swing.JFormattedTextField(java.text.Format)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFormattedTextField_Format()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFormattedTextField sut = null; // = new JFormattedTextField(java.text.Format);
    }

    /**
     * Test method for {@link javax.swing.JFormattedTextField#JFormattedTextField(java.lang.Object) public
     * javax.swing.JFormattedTextField(java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFormattedTextField_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFormattedTextField sut = null; // = new JFormattedTextField(java.lang.Object);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JFormattedTextField.class.isAssignableFrom(sut));
    }

}
