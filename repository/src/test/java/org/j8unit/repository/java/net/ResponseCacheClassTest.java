package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.ResponseCache;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseCacheClassTest
implements org.j8unit.repository.java.net.ResponseCacheClassTests<ResponseCache> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ResponseCache]

    @Override
    public Class<ResponseCache> createNewSUT() {
        return ResponseCache.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ResponseCache#ResponseCache() public
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
     * Test method for the hereby targeted method-under-test {@link ResponseCache#setDefault(ResponseCache) public
     * static synchronized void java.net.ResponseCache.setDefault(java.net.ResponseCache)}.
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
        // write some test for {@link ResponseCache#setDefault(ResponseCache)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ResponseCache#getDefault() public static
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
        // write some test for {@link ResponseCache#getDefault()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ResponseCache]

}
