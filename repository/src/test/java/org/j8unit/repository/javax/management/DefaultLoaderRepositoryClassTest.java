package org.j8unit.repository.javax.management;

import javax.management.DefaultLoaderRepository;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultLoaderRepositoryClassTest
implements org.j8unit.repository.javax.management.DefaultLoaderRepositoryClassTests<DefaultLoaderRepository> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.DefaultLoaderRepository]

    @Override
    public Class<DefaultLoaderRepository> createNewSUT() {
        return DefaultLoaderRepository.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.DefaultLoaderRepository#DefaultLoaderRepository() public
     * javax.management.DefaultLoaderRepository()}.
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
     * {@link javax.management.DefaultLoaderRepository#loadClassWithout(ClassLoader, String) public static
     * java.lang.Class<?>
     * javax.management.DefaultLoaderRepository.loadClassWithout(java.lang.ClassLoader,java.lang.String) throws
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
        // write some test for {@link javax.management.DefaultLoaderRepository#loadClassWithout(ClassLoader, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.DefaultLoaderRepository#loadClass(String) public static java.lang.Class<?>
     * javax.management.DefaultLoaderRepository.loadClass(java.lang.String) throws java.lang.ClassNotFoundException}.
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
        // write some test for {@link javax.management.DefaultLoaderRepository#loadClass(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.DefaultLoaderRepository]

}
