package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.DefaultFormatterFactory class javax.swing.text.DefaultFormatterFactory},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.DefaultFormatterFactoryTests}.
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
 * @see org.j8unit.repository.javax.swing.text.DefaultFormatterFactoryTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultFormatterFactoryClassTests<SUT extends javax.swing.text.DefaultFormatterFactory>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.javax.swing.JFormattedTextFieldClassTests.AbstractFormatterFactoryClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.text.DefaultFormatterFactory#DefaultFormatterFactory() public
     * javax.swing.text.DefaultFormatterFactory()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultFormatterFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultFormatterFactory sut = null; // = new DefaultFormatterFactory();
    }

    /**
     * Test method for
     * {@link javax.swing.text.DefaultFormatterFactory#DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter)
     * public javax.swing.text.DefaultFormatterFactory(javax.swing.JFormattedTextField$AbstractFormatter)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultFormatterFactory_AbstractFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultFormatterFactory sut = null; // = new
                                                                   // DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter);
    }

    /**
     * Test method for
     * {@link javax.swing.text.DefaultFormatterFactory#DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter)
     * public
     * javax.swing.text.DefaultFormatterFactory(javax.swing.JFormattedTextField$AbstractFormatter,javax.swing.JFormattedTextField$AbstractFormatter)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultFormatterFactory_AbstractFormatter_AbstractFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultFormatterFactory sut = null; // = new
                                                                   // DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter);
    }

    /**
     * Test method for
     * {@link javax.swing.text.DefaultFormatterFactory#DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter)
     * public
     * javax.swing.text.DefaultFormatterFactory(javax.swing.JFormattedTextField$AbstractFormatter,javax.swing.JFormattedTextField$AbstractFormatter,javax.swing.JFormattedTextField$AbstractFormatter)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultFormatterFactory_AbstractFormatter_AbstractFormatter_AbstractFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultFormatterFactory sut = null; // = new
                                                                   // DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter);
    }

    /**
     * Test method for
     * {@link javax.swing.text.DefaultFormatterFactory#DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter)
     * public
     * javax.swing.text.DefaultFormatterFactory(javax.swing.JFormattedTextField$AbstractFormatter,javax.swing.JFormattedTextField$AbstractFormatter,javax.swing.JFormattedTextField$AbstractFormatter,javax.swing.JFormattedTextField$AbstractFormatter)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultFormatterFactory_AbstractFormatter_AbstractFormatter_AbstractFormatter_AbstractFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultFormatterFactory sut = null; // = new
                                                                   // DefaultFormatterFactory(javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter,javax.swing.JFormattedTextField.AbstractFormatter);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.DefaultFormatterFactory.class.isAssignableFrom(sut));
    }

}
