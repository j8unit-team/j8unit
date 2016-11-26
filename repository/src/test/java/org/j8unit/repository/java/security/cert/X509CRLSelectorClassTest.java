package org.j8unit.repository.java.security.cert;

import java.security.cert.X509CRLSelector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509CRLSelector} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.X509CRLSelectorClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509CRLSelectorClassTest
implements X509CRLSelectorClassTests<X509CRLSelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.X509CRLSelector]

    @Override
    public Class<X509CRLSelector> createNewSUT() {
        return X509CRLSelector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.X509CRLSelector#X509CRLSelector() public java.security.cert.X509CRLSelector()}.
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
    public void create_X509CRLSelector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X509CRLSelector sut = new X509CRLSelector();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.X509CRLSelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.X509CRLSelector]

}
