package org.j8unit.repository.javax.xml.transform;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.transform.TransformerFactoryConfigurationError class
 * javax.xml.transform.TransformerFactoryConfigurationError}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.transform.TransformerFactoryConfigurationErrorTests}.
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
 * @see org.j8unit.repository.javax.xml.transform.TransformerFactoryConfigurationErrorTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformerFactoryConfigurationErrorClassTests<SUT extends javax.xml.transform.TransformerFactoryConfigurationError>
extends org.j8unit.repository.java.lang.ErrorClassTests<SUT> {

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerFactoryConfigurationError#TransformerFactoryConfigurationError() public
     * javax.xml.transform.TransformerFactoryConfigurationError()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerFactoryConfigurationError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerFactoryConfigurationError sut = null; // = new
                                                                                   // TransformerFactoryConfigurationError();
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerFactoryConfigurationError#TransformerFactoryConfigurationError(java.lang.Exception)
     * public javax.xml.transform.TransformerFactoryConfigurationError(java.lang.Exception)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerFactoryConfigurationError_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerFactoryConfigurationError sut = null; // = new
                                                                                   // TransformerFactoryConfigurationError(java.lang.Exception);
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerFactoryConfigurationError#TransformerFactoryConfigurationError(java.lang.Exception,java.lang.String)
     * public javax.xml.transform.TransformerFactoryConfigurationError(java.lang.Exception,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerFactoryConfigurationError_Exception_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerFactoryConfigurationError sut = null; // = new
                                                                                   // TransformerFactoryConfigurationError(java.lang.Exception,java.lang.String);
    }

    /**
     * Test method for
     * {@link javax.xml.transform.TransformerFactoryConfigurationError#TransformerFactoryConfigurationError(java.lang.String)
     * public javax.xml.transform.TransformerFactoryConfigurationError(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TransformerFactoryConfigurationError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.TransformerFactoryConfigurationError sut = null; // = new
                                                                                   // TransformerFactoryConfigurationError(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.transform.TransformerFactoryConfigurationError.class.isAssignableFrom(sut));
    }

}
