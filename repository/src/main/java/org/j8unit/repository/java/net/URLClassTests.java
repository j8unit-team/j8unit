package org.j8unit.repository.java.net;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.net.URL class java.net.URL}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.net.URLTests}.
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
 * @see org.j8unit.repository.java.net.URLTests
 */
@Category(J8UnitRepository.class)
public abstract interface URLClassTests<SUT extends Class<? extends java.net.URL>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.net.URL#URL(java.lang.String) public java.net.URL(java.lang.String) throws
     * java.net.MalformedURLException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URL_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URL sut = null; // = new URL(java.lang.String);
    }

    /**
     * Test method for {@link java.net.URL#URL(java.lang.String,java.lang.String,int,java.lang.String) public
     * java.net.URL(java.lang.String,java.lang.String,int,java.lang.String) throws java.net.MalformedURLException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URL_String_String_int_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URL sut = null; // = new URL(java.lang.String,java.lang.String,int,java.lang.String);
    }

    /**
     * Test method for
     * {@link java.net.URL#URL(java.lang.String,java.lang.String,int,java.lang.String,java.net.URLStreamHandler) public
     * java.net.URL(java.lang.String,java.lang.String,int,java.lang.String,java.net.URLStreamHandler) throws
     * java.net.MalformedURLException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URL_String_String_int_String_URLStreamHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URL sut = null; // = new
                                       // URL(java.lang.String,java.lang.String,int,java.lang.String,java.net.URLStreamHandler);
    }

    /**
     * Test method for {@link java.net.URL#URL(java.lang.String,java.lang.String,java.lang.String) public
     * java.net.URL(java.lang.String,java.lang.String,java.lang.String) throws java.net.MalformedURLException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URL_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URL sut = null; // = new URL(java.lang.String,java.lang.String,java.lang.String);
    }

    /**
     * Test method for {@link java.net.URL#URL(java.net.URL,java.lang.String) public
     * java.net.URL(java.net.URL,java.lang.String) throws java.net.MalformedURLException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URL_URL_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URL sut = null; // = new URL(java.net.URL,java.lang.String);
    }

    /**
     * Test method for {@link java.net.URL#URL(java.net.URL,java.lang.String,java.net.URLStreamHandler) public
     * java.net.URL(java.net.URL,java.lang.String,java.net.URLStreamHandler) throws java.net.MalformedURLException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URL_URL_String_URLStreamHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URL sut = null; // = new URL(java.net.URL,java.lang.String,java.net.URLStreamHandler);
    }

    /**
     * <p>
     * Test method for {@link java.net.URL#setURLStreamHandlerFactory(java.net.URLStreamHandlerFactory) public static
     * void java.net.URL.setURLStreamHandlerFactory(java.net.URLStreamHandlerFactory)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setURLStreamHandlerFactory_URLStreamHandlerFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.net.URL> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.URL.class.isAssignableFrom(sut));
    }

}
