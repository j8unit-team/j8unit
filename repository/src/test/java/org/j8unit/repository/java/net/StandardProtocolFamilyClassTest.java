package org.j8unit.repository.java.net;

import java.net.StandardProtocolFamily;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StandardProtocolFamily} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.net.StandardProtocolFamilyClassTests}).
 */
@RunWith(J8Unit4.class)
public class StandardProtocolFamilyClassTest
implements StandardProtocolFamilyClassTests<StandardProtocolFamily> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.StandardProtocolFamily]

    @Override
    public Class<StandardProtocolFamily> createNewSUT() {
        return StandardProtocolFamily.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.StandardProtocolFamily#valueOf(String)
     * public static java.net.StandardProtocolFamily java.net.StandardProtocolFamily.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link java.net.StandardProtocolFamily#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.StandardProtocolFamily#values() public
     * static java.net.StandardProtocolFamily[] java.net.StandardProtocolFamily.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link java.net.StandardProtocolFamily#values()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.StandardProtocolFamily]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.StandardProtocolFamily]

}
