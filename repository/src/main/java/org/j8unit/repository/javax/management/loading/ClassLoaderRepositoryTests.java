package org.j8unit.repository.javax.management.loading;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.loading.ClassLoaderRepository interface
 * javax.management.loading.ClassLoaderRepository}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ClassLoaderRepositoryClassTests}.
 * </p>
 *
 * @see javax.management.loading.ClassLoaderRepository interface javax.management.loading.ClassLoaderRepository (the
 *      hereby targeted class-under-test class)
 * @see ClassLoaderRepositoryClassTests ClassLoaderRepositoryClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassLoaderRepositoryTests<SUT extends javax.management.loading.ClassLoaderRepository>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.loading.ClassLoaderRepository#loadClassBefore(ClassLoader, String) public
     * abstract java.lang.Class
     * <?> javax.management.loading.ClassLoaderRepository.loadClassBefore(java.lang.ClassLoader,java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.ClassLoaderRepository#loadClassBefore(ClassLoader, String) public
     * abstract java.lang.Class
     * javax.management.loading.ClassLoaderRepository.loadClassBefore(java.lang.ClassLoader,java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.ClassLoaderRepository#loadClassBefore(ClassLoader, String) public abstract
     *      java.lang.Class
     *      javax.management.loading.ClassLoaderRepository.loadClassBefore(java.lang.ClassLoader,java.lang.String)
     *      throws java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClassBefore_ClassLoader_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.ClassLoaderRepository#loadClass(String) public abstract
     * java.lang.Class<?> javax.management.loading.ClassLoaderRepository.loadClass(java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.ClassLoaderRepository#loadClass(String) public abstract
     * java.lang.Class javax.management.loading.ClassLoaderRepository.loadClass(java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.ClassLoaderRepository#loadClass(String) public abstract java.lang.Class
     *      javax.management.loading.ClassLoaderRepository.loadClass(java.lang.String) throws
     *      java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClass_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.loading.ClassLoaderRepository#loadClassWithout(ClassLoader, String)
     * public abstract java.lang.Class
     * <?> javax.management.loading.ClassLoaderRepository.loadClassWithout(java.lang.ClassLoader,java.lang.String)
     * throws java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.loading.ClassLoaderRepository#loadClassWithout(ClassLoader, String)
     * public abstract java.lang.Class
     * javax.management.loading.ClassLoaderRepository.loadClassWithout(java.lang.ClassLoader,java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.loading.ClassLoaderRepository#loadClassWithout(ClassLoader, String) public abstract
     *      java.lang.Class
     *      javax.management.loading.ClassLoaderRepository.loadClassWithout(java.lang.ClassLoader,java.lang.String)
     *      throws java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loadClassWithout_ClassLoader_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
