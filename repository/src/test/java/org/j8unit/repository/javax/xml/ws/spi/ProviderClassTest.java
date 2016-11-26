package org.j8unit.repository.javax.xml.ws.spi;

import javax.xml.ws.spi.Provider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Provider} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.ws.spi.ProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class ProviderClassTest
implements org.j8unit.repository.javax.xml.ws.spi.ProviderClassTests<Provider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.spi.Provider]

    @Override
    public Class<Provider> createNewSUT() {
        return Provider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.ws.spi.Provider#provider() public static
     * javax.xml.ws.spi.Provider javax.xml.ws.spi.Provider.provider()}.
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
        // write some test for {@link javax.xml.ws.spi.Provider#provider()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.spi.Provider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.spi.Provider]

}
