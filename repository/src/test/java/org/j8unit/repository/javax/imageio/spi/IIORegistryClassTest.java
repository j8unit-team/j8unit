package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.IIORegistry;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIORegistry} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.spi.IIORegistryClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIORegistryClassTest
implements IIORegistryClassTests<IIORegistry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.IIORegistry]

    @Override
    public Class<IIORegistry> createNewSUT() {
        return IIORegistry.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.imageio.spi.IIORegistry#getDefaultInstance()
     * public static javax.imageio.spi.IIORegistry javax.imageio.spi.IIORegistry.getDefaultInstance()}.
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
    public void test_getDefaultInstance()
    throws Exception {
        // write some test for {@link javax.imageio.spi.IIORegistry#getDefaultInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.spi.IIORegistry]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.IIORegistry]

}
