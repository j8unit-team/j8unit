package org.j8unit.repository.javax.imageio.spi;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.imageio.spi.ServiceRegistry class
 * javax.imageio.spi.ServiceRegistry}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.imageio.spi.ServiceRegistry
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServiceRegistryClassTests<SUT extends javax.imageio.spi.ServiceRegistry>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.imageio.spi.ServiceRegistry.Filter interface
     * javax.imageio.spi.ServiceRegistry$Filter}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests.FilterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests.FilterTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.imageio.spi.ServiceRegistry.Filter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterClassTests<SUT extends javax.imageio.spi.ServiceRegistry.Filter>
    extends RepositoryClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.imageio.spi.ServiceRegistry.Filter#isAssignableFrom(java.lang.Class)
         */
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.imageio.spi.ServiceRegistry.Filter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ServiceRegistry#ServiceRegistry(java.util.Iterator) public
     * javax.imageio.spi.ServiceRegistry(java.util.Iterator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.spi.ServiceRegistry#ServiceRegistry(java.util.Iterator)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServiceRegistry_Iterator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.imageio.spi.ServiceRegistry sut = null; // = new ServiceRegistry(java.util.Iterator);
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ServiceRegistry#lookupProviders(java.lang.Class) public static
     * java.util.Iterator javax.imageio.spi.ServiceRegistry.lookupProviders(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.spi.ServiceRegistry#lookupProviders(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupProviders_Class()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ServiceRegistry#lookupProviders(java.lang.Class, java.lang.ClassLoader)
     * public static java.util.Iterator
     * javax.imageio.spi.ServiceRegistry.lookupProviders(java.lang.Class,java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.spi.ServiceRegistry#lookupProviders(java.lang.Class, java.lang.ClassLoader)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupProviders_Class_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.imageio.spi.ServiceRegistry#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.imageio.spi.ServiceRegistry.class.isAssignableFrom(sut));
    }

}
