package org.j8unit.repository.java.net;

import java.net.IDN;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IDN} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.net.IDNClassTests}).
 */

@RunWith(J8Unit4.class)
public class IDNClassTest
implements IDNClassTests<IDN> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.IDN]

    @Override
    public Class<IDN> createNewSUT() {
        return IDN.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.IDN#toUnicode(String) public static
     * java.lang.String java.net.IDN.toUnicode(java.lang.String)}.
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
    public void test_toUnicode_String()
    throws Exception {
        // write some test for {@link java.net.IDN#toUnicode(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.IDN#toUnicode(String, int) public static
     * java.lang.String java.net.IDN.toUnicode(java.lang.String,int)}.
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
    public void test_toUnicode_String_int()
    throws Exception {
        // write some test for {@link java.net.IDN#toUnicode(String, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.IDN#toASCII(String, int) public static
     * java.lang.String java.net.IDN.toASCII(java.lang.String,int)}.
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
    public void test_toASCII_String_int()
    throws Exception {
        // write some test for {@link java.net.IDN#toASCII(String, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.IDN#toASCII(String) public static
     * java.lang.String java.net.IDN.toASCII(java.lang.String)}.
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
    public void test_toASCII_String()
    throws Exception {
        // write some test for {@link java.net.IDN#toASCII(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.IDN]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.IDN]

}
