package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SNIHostName;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SNIHostName} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SNIHostNameClassTests}).
 */

@RunWith(J8Unit4.class)
public class SNIHostNameClassTest
implements SNIHostNameClassTests<SNIHostName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SNIHostName]

    @Override
    public Class<SNIHostName> createNewSUT() {
        return SNIHostName.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.net.ssl.SNIHostName#SNIHostName(String)
     * public javax.net.ssl.SNIHostName(java.lang.String)}.
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
    public void create_SNIHostName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SNIHostName sut = null; // = new SNIHostName(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.net.ssl.SNIHostName#SNIHostName(byte[])
     * public javax.net.ssl.SNIHostName(byte[])}.
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
    public void create_SNIHostName_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SNIHostName sut = null; // = new SNIHostName(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.net.ssl.SNIHostName#createSNIMatcher(String)
     * public static javax.net.ssl.SNIMatcher javax.net.ssl.SNIHostName.createSNIMatcher(java.lang.String)}.
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
    public void test_createSNIMatcher_String()
    throws Exception {
        // write some test for {@link javax.net.ssl.SNIHostName#createSNIMatcher(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SNIHostName]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SNIHostName]

}
