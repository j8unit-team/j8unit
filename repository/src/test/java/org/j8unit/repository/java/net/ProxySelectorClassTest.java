package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.ProxySelector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProxySelectorClassTest
implements org.j8unit.repository.java.net.ProxySelectorClassTests<ProxySelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ProxySelector]

    @Override
    public Class<ProxySelector> createNewSUT() {
        return ProxySelector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ProxySelector#ProxySelector() public
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
     * Test method for the hereby targeted method-under-test {@link ProxySelector#getDefault() public static
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
        // write some test for {@link ProxySelector#getDefault()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link ProxySelector#setDefault(ProxySelector) public
     * static void java.net.ProxySelector.setDefault(java.net.ProxySelector)}.
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
        // write some test for {@link ProxySelector#setDefault(ProxySelector)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ProxySelector]

}
