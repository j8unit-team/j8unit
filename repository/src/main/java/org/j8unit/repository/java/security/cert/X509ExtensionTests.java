package org.j8unit.repository.java.security.cert;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.X509Extension interface java.security.cert.X509Extension}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.X509ExtensionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface X509ExtensionTests<SUT extends java.security.cert.X509Extension>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getCriticalExtensionOIDs() public abstract java.util.Set
     * java.security.cert.X509Extension.getCriticalExtensionOIDs()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCriticalExtensionOIDs()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getExtensionValue(java.lang.String) public abstract
     * byte[] java.security.cert.X509Extension.getExtensionValue(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExtensionValue_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getNonCriticalExtensionOIDs() public abstract
     * java.util.Set java.security.cert.X509Extension.getNonCriticalExtensionOIDs()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNonCriticalExtensionOIDs()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Extension#hasUnsupportedCriticalExtension() public abstract boolean
     * java.security.cert.X509Extension.hasUnsupportedCriticalExtension()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasUnsupportedCriticalExtension()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
