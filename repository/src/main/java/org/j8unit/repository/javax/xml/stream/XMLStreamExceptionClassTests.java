package org.j8unit.repository.javax.xml.stream;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.stream.XMLStreamException class javax.xml.stream.XMLStreamException}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.stream.XMLStreamExceptionTests}.
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
 * @see org.j8unit.repository.javax.xml.stream.XMLStreamExceptionTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLStreamExceptionClassTests<SUT extends javax.xml.stream.XMLStreamException>
extends org.j8unit.repository.java.lang.ExceptionClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.stream.XMLStreamException#XMLStreamException() public
     * javax.xml.stream.XMLStreamException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLStreamException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.XMLStreamException sut = null; // = new XMLStreamException();
    }

    /**
     * Test method for {@link javax.xml.stream.XMLStreamException#XMLStreamException(java.lang.String) public
     * javax.xml.stream.XMLStreamException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLStreamException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.XMLStreamException sut = null; // = new XMLStreamException(java.lang.String);
    }

    /**
     * Test method for
     * {@link javax.xml.stream.XMLStreamException#XMLStreamException(java.lang.String,javax.xml.stream.Location) public
     * javax.xml.stream.XMLStreamException(java.lang.String,javax.xml.stream.Location)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLStreamException_String_Location()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.XMLStreamException sut = null; // = new
                                                              // XMLStreamException(java.lang.String,javax.xml.stream.Location);
    }

    /**
     * Test method for
     * {@link javax.xml.stream.XMLStreamException#XMLStreamException(java.lang.String,javax.xml.stream.Location,java.lang.Throwable)
     * public javax.xml.stream.XMLStreamException(java.lang.String,javax.xml.stream.Location,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLStreamException_String_Location_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.XMLStreamException sut = null; // = new
                                                              // XMLStreamException(java.lang.String,javax.xml.stream.Location,java.lang.Throwable);
    }

    /**
     * Test method for
     * {@link javax.xml.stream.XMLStreamException#XMLStreamException(java.lang.String,java.lang.Throwable) public
     * javax.xml.stream.XMLStreamException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLStreamException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.XMLStreamException sut = null; // = new
                                                              // XMLStreamException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for {@link javax.xml.stream.XMLStreamException#XMLStreamException(java.lang.Throwable) public
     * javax.xml.stream.XMLStreamException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLStreamException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.stream.XMLStreamException sut = null; // = new XMLStreamException(java.lang.Throwable);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.stream.XMLStreamException.class.isAssignableFrom(sut));
    }

}
