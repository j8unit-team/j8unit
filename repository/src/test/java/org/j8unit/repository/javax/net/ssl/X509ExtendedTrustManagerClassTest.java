package org.j8unit.repository.javax.net.ssl;

import static org.junit.Assert.fail;
import javax.net.ssl.X509ExtendedTrustManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509ExtendedTrustManagerClassTest
implements org.j8unit.repository.javax.net.ssl.X509ExtendedTrustManagerClassTests<X509ExtendedTrustManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.X509ExtendedTrustManager]

    @Override
    public Class<X509ExtendedTrustManager> createNewSUT() {
        return X509ExtendedTrustManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link X509ExtendedTrustManager#X509ExtendedTrustManager() public javax.net.ssl.X509ExtendedTrustManager()}.
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
    public void create_X509ExtendedTrustManager()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.X509ExtendedTrustManager]

}
