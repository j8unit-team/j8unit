package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.CacheRequest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CacheRequestClassTest
implements org.j8unit.repository.java.net.CacheRequestClassTests<CacheRequest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.CacheRequest]

    @Override
    public Class<CacheRequest> createNewSUT() {
        return CacheRequest.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.CacheRequest#CacheRequest() public
     * java.net.CacheRequest()}.
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
    public void create_CacheRequest()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.CacheRequest]

}
