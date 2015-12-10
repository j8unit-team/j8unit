package org.j8unit.repository.javax.xml.datatype;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.datatype.DatatypeConfigurationException class
 * javax.xml.datatype.DatatypeConfigurationException}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.datatype.DatatypeConfigurationExceptionTests}.
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
 * @see org.j8unit.repository.javax.xml.datatype.DatatypeConfigurationExceptionTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatatypeConfigurationExceptionClassTests<SUT extends javax.xml.datatype.DatatypeConfigurationException>
extends org.j8unit.repository.java.lang.ExceptionClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.datatype.DatatypeConfigurationException#DatatypeConfigurationException() public
     * javax.xml.datatype.DatatypeConfigurationException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatatypeConfigurationException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.datatype.DatatypeConfigurationException sut = null; // = new DatatypeConfigurationException();
    }

    /**
     * Test method for
     * {@link javax.xml.datatype.DatatypeConfigurationException#DatatypeConfigurationException(java.lang.String) public
     * javax.xml.datatype.DatatypeConfigurationException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatatypeConfigurationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.datatype.DatatypeConfigurationException sut = null; // = new
                                                                            // DatatypeConfigurationException(java.lang.String);
    }

    /**
     * Test method for
     * {@link javax.xml.datatype.DatatypeConfigurationException#DatatypeConfigurationException(java.lang.String,java.lang.Throwable)
     * public javax.xml.datatype.DatatypeConfigurationException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatatypeConfigurationException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.datatype.DatatypeConfigurationException sut = null; // = new
                                                                            // DatatypeConfigurationException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for
     * {@link javax.xml.datatype.DatatypeConfigurationException#DatatypeConfigurationException(java.lang.Throwable)
     * public javax.xml.datatype.DatatypeConfigurationException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DatatypeConfigurationException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.datatype.DatatypeConfigurationException sut = null; // = new
                                                                            // DatatypeConfigurationException(java.lang.Throwable);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.datatype.DatatypeConfigurationException.class.isAssignableFrom(sut));
    }

}
