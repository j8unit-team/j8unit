package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.X509Extension interface
 * java.security.cert.X509Extension}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link X509ExtensionClassTests}.
 * </p>
 *
 * @see java.security.cert.X509Extension interface java.security.cert.X509Extension (the hereby targeted
 *      class-under-test class)
 * @see X509ExtensionClassTests X509ExtensionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509ExtensionTests<SUT extends java.security.cert.X509Extension>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getNonCriticalExtensionOIDs() public abstract
     * java.util.Set<java.lang.String> java.security.cert.X509Extension.getNonCriticalExtensionOIDs()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getNonCriticalExtensionOIDs() public abstract
     * java.util.Set java.security.cert.X509Extension.getNonCriticalExtensionOIDs()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Extension#getNonCriticalExtensionOIDs() public abstract java.util.Set
     *      java.security.cert.X509Extension.getNonCriticalExtensionOIDs() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509Extension#getExtensionValue(String) public abstract byte[]
     * java.security.cert.X509Extension.getExtensionValue(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getExtensionValue(String) public abstract byte[]
     * java.security.cert.X509Extension.getExtensionValue(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Extension#getExtensionValue(String) public abstract byte[]
     *      java.security.cert.X509Extension.getExtensionValue(java.lang.String) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509Extension#hasUnsupportedCriticalExtension() public abstract boolean
     * java.security.cert.X509Extension.hasUnsupportedCriticalExtension()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Extension#hasUnsupportedCriticalExtension() public abstract boolean
     * java.security.cert.X509Extension.hasUnsupportedCriticalExtension()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Extension#hasUnsupportedCriticalExtension() public abstract boolean
     *      java.security.cert.X509Extension.hasUnsupportedCriticalExtension() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getCriticalExtensionOIDs() public abstract java.util.Set
     * <java.lang.String> java.security.cert.X509Extension.getCriticalExtensionOIDs()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Extension#getCriticalExtensionOIDs() public abstract java.util.Set
     * java.security.cert.X509Extension.getCriticalExtensionOIDs()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Extension#getCriticalExtensionOIDs() public abstract java.util.Set
     *      java.security.cert.X509Extension.getCriticalExtensionOIDs() (the hereby targeted method-under-test)
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

}
