package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.ResponseCache;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ResponseCache} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.ResponseCacheClassTests}).
 */

@RunWith(J8Unit4.class)
public class ResponseCacheClassTest
implements ResponseCacheClassTests<ResponseCache> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ResponseCache]

    @Override
    public Class<ResponseCache> createNewSUT() {
        return ResponseCache.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.ResponseCache#ResponseCache() public
     * java.net.ResponseCache()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_ResponseCache()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.ResponseCache#setDefault(java.net.ResponseCache) public static synchronized void
     * java.net.ResponseCache.setDefault(java.net.ResponseCache)}.
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
    public void test_setDefault_ResponseCache()
    throws Exception {
        // write some test for {@link java.net.ResponseCache#setDefault(java.net.ResponseCache)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.ResponseCache#getDefault() public static
     * synchronized java.net.ResponseCache java.net.ResponseCache.getDefault()}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link java.net.ResponseCache#getDefault()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.ResponseCache]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ResponseCache]

}
