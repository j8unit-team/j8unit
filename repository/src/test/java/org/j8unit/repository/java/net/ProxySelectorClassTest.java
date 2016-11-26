package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.ProxySelector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProxySelector} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.ProxySelectorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ProxySelectorClassTest
implements ProxySelectorClassTests<ProxySelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ProxySelector]

    @Override
    public Class<ProxySelector> createNewSUT() {
        return ProxySelector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.ProxySelector#ProxySelector() public
     * java.net.ProxySelector()}.
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
    public void create_ProxySelector()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.ProxySelector#getDefault() public static
     * java.net.ProxySelector java.net.ProxySelector.getDefault()}.
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
        // write some test for {@link java.net.ProxySelector#getDefault()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.ProxySelector#setDefault(java.net.ProxySelector) public static void
     * java.net.ProxySelector.setDefault(java.net.ProxySelector)}.
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
    public void test_setDefault_ProxySelector()
    throws Exception {
        // write some test for {@link java.net.ProxySelector#setDefault(java.net.ProxySelector)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.ProxySelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ProxySelector]

}
