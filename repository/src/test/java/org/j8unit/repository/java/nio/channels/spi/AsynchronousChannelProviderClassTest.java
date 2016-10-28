package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AsynchronousChannelProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousChannelProviderClassTest
implements org.j8unit.repository.java.nio.channels.spi.AsynchronousChannelProviderClassTests<AsynchronousChannelProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.AsynchronousChannelProvider]

    @Override
    public Class<AsynchronousChannelProvider> createNewSUT() {
        return AsynchronousChannelProvider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AsynchronousChannelProvider#provider() public static
     * java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.spi.AsynchronousChannelProvider.provider()}.
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
    public void test_provider()
    throws Exception {
        // write some test for {@link AsynchronousChannelProvider#provider()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.AsynchronousChannelProvider]

}
