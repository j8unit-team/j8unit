package org.j8unit.repository.java.beans;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.XMLDecoder class java.beans.XMLDecoder}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.beans.XMLDecoderTests}.
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
 * @see org.j8unit.repository.java.beans.XMLDecoderTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLDecoderClassTests<SUT extends Class<? extends java.beans.XMLDecoder>>
extends org.j8unit.repository.java.lang.AutoCloseableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.beans.XMLDecoder#XMLDecoder(org.xml.sax.InputSource) public
     * java.beans.XMLDecoder(org.xml.sax.InputSource)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLDecoder_InputSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.XMLDecoder sut = null; // = new XMLDecoder(org.xml.sax.InputSource);
    }

    /**
     * Test method for
     * {@link java.beans.XMLDecoder#XMLDecoder(java.io.InputStream,java.lang.Object,java.beans.ExceptionListener,java.lang.ClassLoader)
     * public
     * java.beans.XMLDecoder(java.io.InputStream,java.lang.Object,java.beans.ExceptionListener,java.lang.ClassLoader)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLDecoder_InputStream_Object_ExceptionListener_ClassLoader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.XMLDecoder sut = null; // = new
                                                // XMLDecoder(java.io.InputStream,java.lang.Object,java.beans.ExceptionListener,java.lang.ClassLoader);
    }

    /**
     * Test method for {@link java.beans.XMLDecoder#XMLDecoder(java.io.InputStream) public
     * java.beans.XMLDecoder(java.io.InputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLDecoder_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.XMLDecoder sut = null; // = new XMLDecoder(java.io.InputStream);
    }

    /**
     * Test method for {@link java.beans.XMLDecoder#XMLDecoder(java.io.InputStream,java.lang.Object) public
     * java.beans.XMLDecoder(java.io.InputStream,java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLDecoder_InputStream_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.XMLDecoder sut = null; // = new XMLDecoder(java.io.InputStream,java.lang.Object);
    }

    /**
     * Test method for
     * {@link java.beans.XMLDecoder#XMLDecoder(java.io.InputStream,java.lang.Object,java.beans.ExceptionListener) public
     * java.beans.XMLDecoder(java.io.InputStream,java.lang.Object,java.beans.ExceptionListener)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLDecoder_InputStream_Object_ExceptionListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.XMLDecoder sut = null; // = new
                                                // XMLDecoder(java.io.InputStream,java.lang.Object,java.beans.ExceptionListener);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.beans.XMLDecoder> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.XMLDecoder.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.XMLDecoder#createHandler(java.lang.Object,java.beans.ExceptionListener,java.lang.ClassLoader)
     * public static org.xml.sax.helpers.DefaultHandler
     * java.beans.XMLDecoder.createHandler(java.lang.Object,java.beans.ExceptionListener,java.lang.ClassLoader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createHandler_Object_ExceptionListener_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
