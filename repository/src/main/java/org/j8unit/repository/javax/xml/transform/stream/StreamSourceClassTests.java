package org.j8unit.repository.javax.xml.transform.stream;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.transform.stream.StreamSource class javax.xml.transform.stream.StreamSource},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.transform.stream.StreamSourceTests}.
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
 * @see org.j8unit.repository.javax.xml.transform.stream.StreamSourceTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamSourceClassTests<SUT extends Class<? extends javax.xml.transform.stream.StreamSource>>
extends org.j8unit.repository.javax.xml.transform.SourceClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.transform.stream.StreamSource#StreamSource() public
     * javax.xml.transform.stream.StreamSource()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamSource sut = null; // = new StreamSource();
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamSource#StreamSource(java.io.File) public
     * javax.xml.transform.stream.StreamSource(java.io.File)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamSource_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamSource sut = null; // = new StreamSource(java.io.File);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamSource#StreamSource(java.io.InputStream) public
     * javax.xml.transform.stream.StreamSource(java.io.InputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamSource_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamSource sut = null; // = new StreamSource(java.io.InputStream);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamSource#StreamSource(java.io.InputStream,java.lang.String)
     * public javax.xml.transform.stream.StreamSource(java.io.InputStream,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamSource_InputStream_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamSource sut = null; // = new
                                                                  // StreamSource(java.io.InputStream,java.lang.String);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamSource#StreamSource(java.io.Reader) public
     * javax.xml.transform.stream.StreamSource(java.io.Reader)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamSource_Reader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamSource sut = null; // = new StreamSource(java.io.Reader);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamSource#StreamSource(java.io.Reader,java.lang.String)
     * public javax.xml.transform.stream.StreamSource(java.io.Reader,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamSource_Reader_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamSource sut = null; // = new
                                                                  // StreamSource(java.io.Reader,java.lang.String);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamSource#StreamSource(java.lang.String) public
     * javax.xml.transform.stream.StreamSource(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamSource_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamSource sut = null; // = new StreamSource(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.xml.transform.stream.StreamSource> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.transform.stream.StreamSource.class.isAssignableFrom(sut));
    }

}
