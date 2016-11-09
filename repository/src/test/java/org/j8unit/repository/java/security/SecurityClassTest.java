package org.j8unit.repository.java.security;

import java.security.Security;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Security} (by simply reusing the J8Unit
 * test interface {@link SecurityClassTests}).
 */

@RunWith(J8Unit4.class)
public class SecurityClassTest
implements SecurityClassTests<Security> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Security]

    @Override
    public Class<Security> createNewSUT() {
        return Security.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#getProvider(String) public
     * static java.security.Provider java.security.Security.getProvider(java.lang.String)}.
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
    public void test_getProvider_String()
    throws Exception {
        // write some test for {@link java.security.Security#getProvider(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.Security#getAlgorithmProperty(String, String) public static java.lang.String
     * java.security.Security.getAlgorithmProperty(java.lang.String,java.lang.String)}.
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
    public void test_getAlgorithmProperty_String_String()
    throws Exception {
        // write some test for {@link java.security.Security#getAlgorithmProperty(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.Security#insertProviderAt(java.security.Provider, int) public static synchronized int
     * java.security.Security.insertProviderAt(java.security.Provider,int)}.
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
    public void test_insertProviderAt_Provider_int()
    throws Exception {
        // write some test for {@link java.security.Security#insertProviderAt(java.security.Provider, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#getAlgorithms(String) public
     * static java.util.Set<java.lang.String> java.security.Security.getAlgorithms(java.lang.String)}.
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
    public void test_getAlgorithms_String()
    throws Exception {
        // write some test for {@link java.security.Security#getAlgorithms(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#removeProvider(String) public
     * static synchronized void java.security.Security.removeProvider(java.lang.String)}.
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
    public void test_removeProvider_String()
    throws Exception {
        // write some test for {@link java.security.Security#removeProvider(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.Security#addProvider(java.security.Provider) public static int
     * java.security.Security.addProvider(java.security.Provider)}.
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
    public void test_addProvider_Provider()
    throws Exception {
        // write some test for {@link java.security.Security#addProvider(java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#getProperty(String) public
     * static java.lang.String java.security.Security.getProperty(java.lang.String)}.
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
    public void test_getProperty_String()
    throws Exception {
        // write some test for {@link java.security.Security#getProperty(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#setProperty(String, String)
     * public static void java.security.Security.setProperty(java.lang.String,java.lang.String)}.
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
    public void test_setProperty_String_String()
    throws Exception {
        // write some test for {@link java.security.Security#setProperty(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#getProviders() public static
     * java.security.Provider[] java.security.Security.getProviders()}.
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
    public void test_getProviders()
    throws Exception {
        // write some test for {@link java.security.Security#getProviders()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#getProviders(java.util.Map)
     * public static java.security.Provider[] java.security.Security.getProviders(java.util.Map<java.lang.String,
     * java.lang.String>)}.
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
    public void test_getProviders_Map()
    throws Exception {
        // write some test for {@link java.security.Security#getProviders(java.util.Map)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Security#getProviders(String) public
     * static java.security.Provider[] java.security.Security.getProviders(java.lang.String)}.
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
    public void test_getProviders_String()
    throws Exception {
        // write some test for {@link java.security.Security#getProviders(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Security]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Security]

}
