package org.j8unit.repository.javax.xml.transform;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.transform.TransformerConfigurationException class
 * javax.xml.transform.TransformerConfigurationException}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.transform.TransformerConfigurationExceptionTests}.
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
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.TransformerConfigurationExceptionTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformerConfigurationExceptionClassTests<SUT extends Class<? extends javax.xml.transform.TransformerConfigurationException>>
extends org.j8unit.repository.javax.xml.transform.TransformerExceptionClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.transform.TransformerConfigurationException#TransformerConfigurationException()
     * public javax.xml.transform.TransformerConfigurationException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerConfigurationException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerConfigurationException sut = null; // = new
                                                                                // TransformerConfigurationException();
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerConfigurationException#TransformerConfigurationException(java.lang.String)
     * public javax.xml.transform.TransformerConfigurationException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerConfigurationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerConfigurationException sut = null; // = new
                                                                                // TransformerConfigurationException(java.lang.String);
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerConfigurationException#TransformerConfigurationException(java.lang.String,javax.xml.transform.SourceLocator)
     * public javax.xml.transform.TransformerConfigurationException(java.lang.String,javax.xml.transform.SourceLocator)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerConfigurationException_String_SourceLocator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerConfigurationException sut = null; // = new
                                                                                // TransformerConfigurationException(java.lang.String,javax.xml.transform.SourceLocator);
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerConfigurationException#TransformerConfigurationException(java.lang.String,javax.xml.transform.SourceLocator,java.lang.Throwable)
     * public
     * javax.xml.transform.TransformerConfigurationException(java.lang.String,javax.xml.transform.SourceLocator,java.lang.Throwable)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerConfigurationException_String_SourceLocator_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerConfigurationException sut = null; // = new
                                                                                // TransformerConfigurationException(java.lang.String,javax.xml.transform.SourceLocator,java.lang.Throwable);
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerConfigurationException#TransformerConfigurationException(java.lang.String,java.lang.Throwable)
     * public javax.xml.transform.TransformerConfigurationException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerConfigurationException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerConfigurationException sut = null; // = new
                                                                                // TransformerConfigurationException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerConfigurationException#TransformerConfigurationException(java.lang.Throwable)
     * public javax.xml.transform.TransformerConfigurationException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerConfigurationException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerConfigurationException sut = null; // = new
                                                                                // TransformerConfigurationException(java.lang.Throwable);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.xml.transform.TransformerConfigurationException> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.transform.TransformerConfigurationException.class.isAssignableFrom(sut));
    }

}
