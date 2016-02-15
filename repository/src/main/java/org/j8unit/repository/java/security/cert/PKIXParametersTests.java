package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.PKIXParameters class java.security.cert.PKIXParameters}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link PKIXParametersClassTests}.
 * </p>
 *
 * @see java.security.cert.PKIXParameters class java.security.cert.PKIXParameters (the hereby targeted class-under-test
 *      class)
 * @see PKIXParametersClassTests PKIXParametersClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXParametersTests<SUT extends java.security.cert.PKIXParameters>
extends CertPathParametersTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#addCertStore(java.security.cert.CertStore) public void
     * java.security.cert.PKIXParameters.addCertStore(java.security.cert.CertStore)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#addCertStore(java.security.cert.CertStore) public void
     * java.security.cert.PKIXParameters.addCertStore(java.security.cert.CertStore)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#addCertStore(java.security.cert.CertStore) public void
     *      java.security.cert.PKIXParameters.addCertStore(java.security.cert.CertStore) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addCertStore_CertStore()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setCertStores(java.util.List) public void
     * java.security.cert.PKIXParameters.setCertStores(java.util.List<java.security.cert.CertStore>)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setCertStores(java.util.List) public void
     * java.security.cert.PKIXParameters.setCertStores(java.util.List)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setCertStores(java.util.List) public void
     *      java.security.cert.PKIXParameters.setCertStores(java.util.List) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCertStores_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.cert.PKIXParameters#setTargetCertConstraints(java.security.cert.CertSelector) public void
     * java.security.cert.PKIXParameters.setTargetCertConstraints(java.security.cert.CertSelector)}.
     *
     * <p>
     * Test method for
     * {@link java.security.cert.PKIXParameters#setTargetCertConstraints(java.security.cert.CertSelector) public void
     * java.security.cert.PKIXParameters.setTargetCertConstraints(java.security.cert.CertSelector)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setTargetCertConstraints(java.security.cert.CertSelector) public void
     *      java.security.cert.PKIXParameters.setTargetCertConstraints(java.security.cert.CertSelector) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTargetCertConstraints_CertSelector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isExplicitPolicyRequired() public boolean
     * java.security.cert.PKIXParameters.isExplicitPolicyRequired()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isExplicitPolicyRequired() public boolean
     * java.security.cert.PKIXParameters.isExplicitPolicyRequired()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#isExplicitPolicyRequired() public boolean
     *      java.security.cert.PKIXParameters.isExplicitPolicyRequired() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isExplicitPolicyRequired()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isRevocationEnabled() public boolean
     * java.security.cert.PKIXParameters.isRevocationEnabled()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isRevocationEnabled() public boolean
     * java.security.cert.PKIXParameters.isRevocationEnabled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#isRevocationEnabled() public boolean
     *      java.security.cert.PKIXParameters.isRevocationEnabled() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRevocationEnabled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getInitialPolicies() public java.util.Set
     * <java.lang.String> java.security.cert.PKIXParameters.getInitialPolicies()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getInitialPolicies() public java.util.Set
     * java.security.cert.PKIXParameters.getInitialPolicies()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getInitialPolicies() public java.util.Set
     *      java.security.cert.PKIXParameters.getInitialPolicies() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInitialPolicies()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setAnyPolicyInhibited(boolean) public void
     * java.security.cert.PKIXParameters.setAnyPolicyInhibited(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setAnyPolicyInhibited(boolean) public void
     * java.security.cert.PKIXParameters.setAnyPolicyInhibited(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setAnyPolicyInhibited(boolean) public void
     *      java.security.cert.PKIXParameters.setAnyPolicyInhibited(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAnyPolicyInhibited_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setSigProvider(String) public void
     * java.security.cert.PKIXParameters.setSigProvider(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setSigProvider(String) public void
     * java.security.cert.PKIXParameters.setSigProvider(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setSigProvider(String) public void
     *      java.security.cert.PKIXParameters.setSigProvider(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSigProvider_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#clone() public java.lang.Object
     * java.security.cert.PKIXParameters.clone()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#clone() public java.lang.Object
     * java.security.cert.PKIXParameters.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#clone() public java.lang.Object java.security.cert.PKIXParameters.clone()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setDate(java.util.Date) public void
     * java.security.cert.PKIXParameters.setDate(java.util.Date)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setDate(java.util.Date) public void
     * java.security.cert.PKIXParameters.setDate(java.util.Date)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setDate(java.util.Date) public void
     *      java.security.cert.PKIXParameters.setDate(java.util.Date) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDate_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#toString() public java.lang.String
     * java.security.cert.PKIXParameters.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#toString() public java.lang.String
     * java.security.cert.PKIXParameters.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#toString() public java.lang.String
     *      java.security.cert.PKIXParameters.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setRevocationEnabled(boolean) public void
     * java.security.cert.PKIXParameters.setRevocationEnabled(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setRevocationEnabled(boolean) public void
     * java.security.cert.PKIXParameters.setRevocationEnabled(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setRevocationEnabled(boolean) public void
     *      java.security.cert.PKIXParameters.setRevocationEnabled(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRevocationEnabled_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isPolicyMappingInhibited() public boolean
     * java.security.cert.PKIXParameters.isPolicyMappingInhibited()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isPolicyMappingInhibited() public boolean
     * java.security.cert.PKIXParameters.isPolicyMappingInhibited()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#isPolicyMappingInhibited() public boolean
     *      java.security.cert.PKIXParameters.isPolicyMappingInhibited() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPolicyMappingInhibited()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getCertPathCheckers() public java.util.List
     * <java.security.cert.PKIXCertPathChecker> java.security.cert.PKIXParameters.getCertPathCheckers()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getCertPathCheckers() public java.util.List
     * java.security.cert.PKIXParameters.getCertPathCheckers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getCertPathCheckers() public java.util.List
     *      java.security.cert.PKIXParameters.getCertPathCheckers() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertPathCheckers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getTrustAnchors() public java.util.Set
     * <java.security.cert.TrustAnchor> java.security.cert.PKIXParameters.getTrustAnchors()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getTrustAnchors() public java.util.Set
     * java.security.cert.PKIXParameters.getTrustAnchors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getTrustAnchors() public java.util.Set
     *      java.security.cert.PKIXParameters.getTrustAnchors() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrustAnchors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setPolicyMappingInhibited(boolean) public void
     * java.security.cert.PKIXParameters.setPolicyMappingInhibited(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setPolicyMappingInhibited(boolean) public void
     * java.security.cert.PKIXParameters.setPolicyMappingInhibited(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setPolicyMappingInhibited(boolean) public void
     *      java.security.cert.PKIXParameters.setPolicyMappingInhibited(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPolicyMappingInhibited_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getTargetCertConstraints() public
     * java.security.cert.CertSelector java.security.cert.PKIXParameters.getTargetCertConstraints()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getTargetCertConstraints() public
     * java.security.cert.CertSelector java.security.cert.PKIXParameters.getTargetCertConstraints()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getTargetCertConstraints() public java.security.cert.CertSelector
     *      java.security.cert.PKIXParameters.getTargetCertConstraints() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetCertConstraints()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setCertPathCheckers(java.util.List) public void
     * java.security.cert.PKIXParameters.setCertPathCheckers(java.util.List<java.security.cert.PKIXCertPathChecker>)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setCertPathCheckers(java.util.List) public void
     * java.security.cert.PKIXParameters.setCertPathCheckers(java.util.List)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setCertPathCheckers(java.util.List) public void
     *      java.security.cert.PKIXParameters.setCertPathCheckers(java.util.List) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCertPathCheckers_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isAnyPolicyInhibited() public boolean
     * java.security.cert.PKIXParameters.isAnyPolicyInhibited()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#isAnyPolicyInhibited() public boolean
     * java.security.cert.PKIXParameters.isAnyPolicyInhibited()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#isAnyPolicyInhibited() public boolean
     *      java.security.cert.PKIXParameters.isAnyPolicyInhibited() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAnyPolicyInhibited()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.cert.PKIXParameters#addCertPathChecker(java.security.cert.PKIXCertPathChecker) public void
     * java.security.cert.PKIXParameters.addCertPathChecker(java.security.cert.PKIXCertPathChecker)}.
     *
     * <p>
     * Test method for
     * {@link java.security.cert.PKIXParameters#addCertPathChecker(java.security.cert.PKIXCertPathChecker) public void
     * java.security.cert.PKIXParameters.addCertPathChecker(java.security.cert.PKIXCertPathChecker)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#addCertPathChecker(java.security.cert.PKIXCertPathChecker) public void
     *      java.security.cert.PKIXParameters.addCertPathChecker(java.security.cert.PKIXCertPathChecker) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addCertPathChecker_PKIXCertPathChecker()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setPolicyQualifiersRejected(boolean) public void
     * java.security.cert.PKIXParameters.setPolicyQualifiersRejected(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setPolicyQualifiersRejected(boolean) public void
     * java.security.cert.PKIXParameters.setPolicyQualifiersRejected(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setPolicyQualifiersRejected(boolean) public void
     *      java.security.cert.PKIXParameters.setPolicyQualifiersRejected(boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPolicyQualifiersRejected_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getPolicyQualifiersRejected() public boolean
     * java.security.cert.PKIXParameters.getPolicyQualifiersRejected()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getPolicyQualifiersRejected() public boolean
     * java.security.cert.PKIXParameters.getPolicyQualifiersRejected()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getPolicyQualifiersRejected() public boolean
     *      java.security.cert.PKIXParameters.getPolicyQualifiersRejected() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPolicyQualifiersRejected()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setExplicitPolicyRequired(boolean) public void
     * java.security.cert.PKIXParameters.setExplicitPolicyRequired(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setExplicitPolicyRequired(boolean) public void
     * java.security.cert.PKIXParameters.setExplicitPolicyRequired(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setExplicitPolicyRequired(boolean) public void
     *      java.security.cert.PKIXParameters.setExplicitPolicyRequired(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setExplicitPolicyRequired_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setInitialPolicies(java.util.Set) public void
     * java.security.cert.PKIXParameters.setInitialPolicies(java.util.Set<java.lang.String>)}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setInitialPolicies(java.util.Set) public void
     * java.security.cert.PKIXParameters.setInitialPolicies(java.util.Set)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setInitialPolicies(java.util.Set) public void
     *      java.security.cert.PKIXParameters.setInitialPolicies(java.util.Set) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setInitialPolicies_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setTrustAnchors(java.util.Set) public void
     * java.security.cert.PKIXParameters.setTrustAnchors(java.util.Set<java.security.cert.TrustAnchor>) throws
     * java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#setTrustAnchors(java.util.Set) public void
     * java.security.cert.PKIXParameters.setTrustAnchors(java.util.Set) throws
     * java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#setTrustAnchors(java.util.Set) public void
     *      java.security.cert.PKIXParameters.setTrustAnchors(java.util.Set) throws
     *      java.security.InvalidAlgorithmParameterException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTrustAnchors_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getDate() public java.util.Date
     * java.security.cert.PKIXParameters.getDate()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getDate() public java.util.Date
     * java.security.cert.PKIXParameters.getDate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getDate() public java.util.Date
     *      java.security.cert.PKIXParameters.getDate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getCertStores() public java.util.List
     * <java.security.cert.CertStore> java.security.cert.PKIXParameters.getCertStores()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getCertStores() public java.util.List
     * java.security.cert.PKIXParameters.getCertStores()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getCertStores() public java.util.List
     *      java.security.cert.PKIXParameters.getCertStores() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertStores()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getSigProvider() public java.lang.String
     * java.security.cert.PKIXParameters.getSigProvider()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#getSigProvider() public java.lang.String
     * java.security.cert.PKIXParameters.getSigProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXParameters#getSigProvider() public java.lang.String
     *      java.security.cert.PKIXParameters.getSigProvider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSigProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
