package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.HostnameVerifier interface
 * javax.net.ssl.HostnameVerifier}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.HostnameVerifierTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.HostnameVerifierClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.HostnameVerifier
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HostnameVerifierTests<SUT extends javax.net.ssl.HostnameVerifier>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.HostnameVerifier#verify(java.lang.String, javax.net.ssl.SSLSession) public
     * abstract boolean javax.net.ssl.HostnameVerifier.verify(java.lang.String,javax.net.ssl.SSLSession)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.HostnameVerifier#verify(java.lang.String, javax.net.ssl.SSLSession)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_String_SSLSession()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
