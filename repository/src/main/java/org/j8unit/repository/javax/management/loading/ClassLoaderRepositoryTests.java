package org.j8unit.repository.javax.management.loading;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.loading.ClassLoaderRepository interface
 * javax.management.loading.ClassLoaderRepository}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.loading.ClassLoaderRepositoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ClassLoaderRepositoryTests<SUT extends javax.management.loading.ClassLoaderRepository>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.loading.ClassLoaderRepository#loadClass(java.lang.String) public abstract
     * java.lang.Class javax.management.loading.ClassLoaderRepository.loadClass(java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     * </p>
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
     * Test method for
     * {@link javax.management.loading.ClassLoaderRepository#loadClassBefore(java.lang.ClassLoader,java.lang.String)
     * public abstract java.lang.Class
     * javax.management.loading.ClassLoaderRepository.loadClassBefore(java.lang.ClassLoader,java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     * </p>
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
     * Test method for
     * {@link javax.management.loading.ClassLoaderRepository#loadClassWithout(java.lang.ClassLoader,java.lang.String)
     * public abstract java.lang.Class
     * javax.management.loading.ClassLoaderRepository.loadClassWithout(java.lang.ClassLoader,java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     * </p>
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
