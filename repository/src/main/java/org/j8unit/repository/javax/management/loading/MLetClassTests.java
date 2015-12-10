package org.j8unit.repository.javax.management.loading;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.loading.MLet class javax.management.loading.MLet}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.loading.MLetTests}.
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
 * @see org.j8unit.repository.javax.management.loading.MLetTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MLetClassTests<SUT extends javax.management.loading.MLet>
extends org.j8unit.repository.javax.management.loading.MLetMBeanClassTests<SUT>, org.j8unit.repository.javax.management.MBeanRegistrationClassTests<SUT>,
org.j8unit.repository.java.io.ExternalizableClassTests<SUT>, org.j8unit.repository.java.net.URLClassLoaderClassTests<SUT> {

    /**
     * Test method for {@link javax.management.loading.MLet#MLet() public javax.management.loading.MLet()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MLet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.loading.MLet sut = null; // = new MLet();
    }

    /**
     * Test method for {@link javax.management.loading.MLet#MLet(java.net.URL[]) public
     * javax.management.loading.MLet(java.net.URL[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MLet_URLArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.loading.MLet sut = null; // = new MLet(java.net.URL[]);
    }

    /**
     * Test method for {@link javax.management.loading.MLet#MLet(java.net.URL[],boolean) public
     * javax.management.loading.MLet(java.net.URL[],boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MLet_URLArray_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.loading.MLet sut = null; // = new MLet(java.net.URL[],boolean);
    }

    /**
     * Test method for {@link javax.management.loading.MLet#MLet(java.net.URL[],java.lang.ClassLoader) public
     * javax.management.loading.MLet(java.net.URL[],java.lang.ClassLoader)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MLet_URLArray_ClassLoader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.loading.MLet sut = null; // = new MLet(java.net.URL[],java.lang.ClassLoader);
    }

    /**
     * Test method for {@link javax.management.loading.MLet#MLet(java.net.URL[],java.lang.ClassLoader,boolean) public
     * javax.management.loading.MLet(java.net.URL[],java.lang.ClassLoader,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MLet_URLArray_ClassLoader_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.loading.MLet sut = null; // = new MLet(java.net.URL[],java.lang.ClassLoader,boolean);
    }

    /**
     * Test method for
     * {@link javax.management.loading.MLet#MLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory)
     * public javax.management.loading.MLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MLet_URLArray_ClassLoader_URLStreamHandlerFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.loading.MLet sut = null; // = new
                                                        // MLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory);
    }

    /**
     * Test method for
     * {@link javax.management.loading.MLet#MLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory,boolean)
     * public
     * javax.management.loading.MLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MLet_URLArray_ClassLoader_URLStreamHandlerFactory_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.loading.MLet sut = null; // = new
                                                        // MLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.loading.MLet.class.isAssignableFrom(sut));
    }

}
