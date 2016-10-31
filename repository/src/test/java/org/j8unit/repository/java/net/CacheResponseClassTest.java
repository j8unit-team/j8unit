package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.CacheResponse;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CacheResponseClassTest
implements org.j8unit.repository.java.net.CacheResponseClassTests<CacheResponse> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.CacheResponse]

    @Override
    public Class<CacheResponse> createNewSUT() {
        return CacheResponse.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.CacheResponse#CacheResponse() public
     * java.net.CacheResponse()}.
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
    public void create_CacheResponse()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.CacheResponse]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.CacheResponse]

}
