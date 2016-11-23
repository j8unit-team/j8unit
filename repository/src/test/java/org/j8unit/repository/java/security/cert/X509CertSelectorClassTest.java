package org.j8unit.repository.java.security.cert;

import java.security.cert.X509CertSelector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509CertSelector} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.X509CertSelectorClassTests}).
 */

@RunWith(J8Unit4.class)
public class X509CertSelectorClassTest
implements X509CertSelectorClassTests<X509CertSelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.X509CertSelector]

    @Override
    public Class<X509CertSelector> createNewSUT() {
        return X509CertSelector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.X509CertSelector#X509CertSelector() public java.security.cert.X509CertSelector()}.
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
    public void create_X509CertSelector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X509CertSelector sut = new X509CertSelector();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.X509CertSelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.X509CertSelector]

}
