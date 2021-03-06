package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.SelectorProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SelectorProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.spi.SelectorProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class SelectorProviderClassTest
implements SelectorProviderClassTests<SelectorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.SelectorProvider]

    @Override
    public Class<SelectorProvider> createNewSUT() {
        return SelectorProvider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.channels.spi.SelectorProvider#provider()
     * public static java.nio.channels.spi.SelectorProvider java.nio.channels.spi.SelectorProvider.provider()}.
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
        // write some test for {@link java.nio.channels.spi.SelectorProvider#provider()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.spi.SelectorProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.SelectorProvider]

}
