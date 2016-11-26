package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClassLoader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.ClassLoaderClassTests}).
 */
@RunWith(J8Unit4.class)
public class ClassLoaderClassTest
implements ClassLoaderClassTests<ClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ClassLoader]

    @Override
    public Class<ClassLoader> createNewSUT() {
        return ClassLoader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ClassLoader#getSystemResource(String) public static
     * java.net.URL java.lang.ClassLoader.getSystemResource(java.lang.String)}.
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
    public void test_getSystemResource_String()
    throws Exception {
        // write some test for {@link ClassLoader#getSystemResource(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ClassLoader#getSystemClassLoader() public static
     * java.lang.ClassLoader java.lang.ClassLoader.getSystemClassLoader()}.
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
    public void test_getSystemClassLoader()
    throws Exception {
        // write some test for {@link ClassLoader#getSystemClassLoader()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ClassLoader#getSystemResourceAsStream(String) public
     * static java.io.InputStream java.lang.ClassLoader.getSystemResourceAsStream(java.lang.String)}.
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
    public void test_getSystemResourceAsStream_String()
    throws Exception {
        // write some test for {@link ClassLoader#getSystemResourceAsStream(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ClassLoader#getSystemResources(String) public static
     * java.util.Enumeration<java.net.URL> java.lang.ClassLoader.getSystemResources(java.lang.String) throws
     * java.io.IOException}.
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
    public void test_getSystemResources_String()
    throws Exception {
        // write some test for {@link ClassLoader#getSystemResources(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ClassLoader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ClassLoader]

}
