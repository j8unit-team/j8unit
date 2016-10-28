package org.j8unit.repository.javax.net;

import javax.net.SocketFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketFactoryClassTest
implements org.j8unit.repository.javax.net.SocketFactoryClassTests<SocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.SocketFactory]

    @Override
    public Class<SocketFactory> createNewSUT() {
        return SocketFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link SocketFactory#getDefault() public static
     * javax.net.SocketFactory javax.net.SocketFactory.getDefault()}.
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
        // write some test for {@link SocketFactory#getDefault()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.SocketFactory]

}
