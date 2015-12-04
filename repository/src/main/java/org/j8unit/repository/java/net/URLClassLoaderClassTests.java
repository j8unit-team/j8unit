package org.j8unit.repository.java.net;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.net.URLClassLoader class java.net.URLClassLoader}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.net.URLClassLoaderTests}.
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
 * @see org.j8unit.repository.java.net.URLClassLoaderTests
 */
@Category(J8UnitRepository.class)
public abstract interface URLClassLoaderClassTests<SUT extends Class<? extends java.net.URLClassLoader>>
extends org.j8unit.repository.java.io.CloseableClassTests<SUT>, org.j8unit.repository.java.security.SecureClassLoaderClassTests<SUT> {

    /**
     * Test method for {@link java.net.URLClassLoader#URLClassLoader(java.net.URL[]) public
     * java.net.URLClassLoader(java.net.URL[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URLClassLoader_URLArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URLClassLoader sut = null; // = new URLClassLoader(java.net.URL[]);
    }

    /**
     * Test method for {@link java.net.URLClassLoader#URLClassLoader(java.net.URL[],java.lang.ClassLoader) public
     * java.net.URLClassLoader(java.net.URL[],java.lang.ClassLoader)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URLClassLoader_URLArray_ClassLoader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URLClassLoader sut = null; // = new URLClassLoader(java.net.URL[],java.lang.ClassLoader);
    }

    /**
     * Test method for
     * {@link java.net.URLClassLoader#URLClassLoader(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory)
     * public java.net.URLClassLoader(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_URLClassLoader_URLArray_ClassLoader_URLStreamHandlerFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.URLClassLoader sut = null; // = new
                                                  // URLClassLoader(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory);
    }

    /**
     * <p>
     * Test method for {@link java.net.URLClassLoader#newInstance(java.net.URL[]) public static java.net.URLClassLoader
     * java.net.URLClassLoader.newInstance(java.net.URL[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_URLArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.URLClassLoader#newInstance(java.net.URL[],java.lang.ClassLoader) public static
     * java.net.URLClassLoader java.net.URLClassLoader.newInstance(java.net.URL[],java.lang.ClassLoader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_URLArray_ClassLoader()
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
        final Class<? extends java.net.URLClassLoader> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.URLClassLoader.class.isAssignableFrom(sut));
    }

}
