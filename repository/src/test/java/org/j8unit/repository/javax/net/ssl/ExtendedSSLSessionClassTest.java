package org.j8unit.repository.javax.net.ssl;

import static org.junit.Assert.fail;
import javax.net.ssl.ExtendedSSLSession;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExtendedSSLSession} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.ExtendedSSLSessionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExtendedSSLSessionClassTest
implements ExtendedSSLSessionClassTests<ExtendedSSLSession> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.ExtendedSSLSession]

    @Override
    public Class<ExtendedSSLSession> createNewSUT() {
        return ExtendedSSLSession.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.ExtendedSSLSession#ExtendedSSLSession() public javax.net.ssl.ExtendedSSLSession()}.
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
    public void create_ExtendedSSLSession()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.ExtendedSSLSession]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.ExtendedSSLSession]

}
