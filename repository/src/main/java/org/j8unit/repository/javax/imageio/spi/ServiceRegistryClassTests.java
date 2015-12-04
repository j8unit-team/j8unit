package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.ServiceRegistry class javax.imageio.spi.ServiceRegistry},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServiceRegistryClassTests<SUT extends Class<? extends javax.imageio.spi.ServiceRegistry>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.imageio.spi.ServiceRegistry#ServiceRegistry(java.util.Iterator) public javax.imageio.spi.ServiceRegistry(java.util.Iterator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServiceRegistry_Iterator() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.imageio.spi.ServiceRegistry sut = null; // = new ServiceRegistry(java.util.Iterator);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.imageio.spi.ServiceRegistry> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.imageio.spi.ServiceRegistry.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ServiceRegistry#lookupProviders(java.lang.Class) public static java.util.Iterator javax.imageio.spi.ServiceRegistry.lookupProviders(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupProviders_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ServiceRegistry#lookupProviders(java.lang.Class,java.lang.ClassLoader) public static java.util.Iterator javax.imageio.spi.ServiceRegistry.lookupProviders(java.lang.Class,java.lang.ClassLoader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupProviders_Class_ClassLoader() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.imageio.spi.ServiceRegistry$Filter interface javax.imageio.spi.ServiceRegistry$Filter},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests.FilterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests.FilterTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FilterClassTests<SUT extends Class<? extends javax.imageio.spi.ServiceRegistry.Filter>>
    extends J8UnitTest<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.imageio.spi.ServiceRegistry.Filter> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.imageio.spi.ServiceRegistry.Filter.class.isAssignableFrom(sut));
        }

    }

}
