package org.j8unit.repository.javax.management.loading;

import javax.management.loading.DefaultLoaderRepository;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultLoaderRepository} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.loading.DefaultLoaderRepositoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultLoaderRepositoryClassTest
implements org.j8unit.repository.javax.management.loading.DefaultLoaderRepositoryClassTests<DefaultLoaderRepository> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.loading.DefaultLoaderRepository]

    @Override
    public Class<DefaultLoaderRepository> createNewSUT() {
        return DefaultLoaderRepository.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.loading.DefaultLoaderRepository#DefaultLoaderRepository() public
     * javax.management.loading.DefaultLoaderRepository()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DefaultLoaderRepository()
    throws Exception {
        // create new instance
        final DefaultLoaderRepository sut = new DefaultLoaderRepository();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.loading.DefaultLoaderRepository#loadClass(String) public static java.lang.Class<?>
     * javax.management.loading.DefaultLoaderRepository.loadClass(java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_loadClass_String()
    throws Exception {
        // write some test for {@link javax.management.loading.DefaultLoaderRepository#loadClass(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.loading.DefaultLoaderRepository#loadClassWithout(ClassLoader, String) public static
     * java.lang.Class<?>
     * javax.management.loading.DefaultLoaderRepository.loadClassWithout(java.lang.ClassLoader,java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_loadClassWithout_ClassLoader_String()
    throws Exception {
        // write some test for {@link javax.management.loading.DefaultLoaderRepository#loadClassWithout(ClassLoader,
        // String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.loading.DefaultLoaderRepository]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.loading.DefaultLoaderRepository]

}
