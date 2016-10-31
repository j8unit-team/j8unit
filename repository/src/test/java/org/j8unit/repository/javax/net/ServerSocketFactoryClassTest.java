package org.j8unit.repository.javax.net;

import javax.net.ServerSocketFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketFactoryClassTest
implements org.j8unit.repository.javax.net.ServerSocketFactoryClassTests<ServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ServerSocketFactory]

    @Override
    public Class<ServerSocketFactory> createNewSUT() {
        return ServerSocketFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.net.ServerSocketFactory#getDefault() public
     * static javax.net.ServerSocketFactory javax.net.ServerSocketFactory.getDefault()}.
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
        // write some test for {@link javax.net.ServerSocketFactory#getDefault()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ServerSocketFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ServerSocketFactory]

}
