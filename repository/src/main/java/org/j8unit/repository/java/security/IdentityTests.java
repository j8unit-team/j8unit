package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.Identity class java.security.Identity}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link IdentityClassTests}.
 * </p>
 *
 * @see java.security.Identity class java.security.Identity (the hereby targeted class-under-test class)
 * @see IdentityClassTests IdentityClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IdentityTests<SUT extends java.security.Identity>
extends PrincipalTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Identity#getName() public final java.lang.String
     * java.security.Identity.getName()}.
     *
     * <p>
     * Test method for {@link java.security.Identity#getName() public final java.lang.String
     * java.security.Identity.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#getName() public final java.lang.String java.security.Identity.getName() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#getInfo() public java.lang.String java.security.Identity.getInfo()}
     * .
     *
     * <p>
     * Test method for {@link java.security.Identity#getInfo() public java.lang.String java.security.Identity.getInfo()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#getInfo() public java.lang.String java.security.Identity.getInfo() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#getPublicKey() public java.security.PublicKey
     * java.security.Identity.getPublicKey()}.
     *
     * <p>
     * Test method for {@link java.security.Identity#getPublicKey() public java.security.PublicKey
     * java.security.Identity.getPublicKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#getPublicKey() public java.security.PublicKey java.security.Identity.getPublicKey()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#setPublicKey(java.security.PublicKey) public void
     * java.security.Identity.setPublicKey(java.security.PublicKey) throws java.security.KeyManagementException}.
     *
     * <p>
     * Test method for {@link java.security.Identity#setPublicKey(java.security.PublicKey) public void
     * java.security.Identity.setPublicKey(java.security.PublicKey) throws java.security.KeyManagementException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#setPublicKey(java.security.PublicKey) public void
     *      java.security.Identity.setPublicKey(java.security.PublicKey) throws java.security.KeyManagementException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPublicKey_PublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#addCertificate(java.security.Certificate) public void
     * java.security.Identity.addCertificate(java.security.Certificate) throws java.security.KeyManagementException}.
     *
     * <p>
     * Test method for {@link java.security.Identity#addCertificate(java.security.Certificate) public void
     * java.security.Identity.addCertificate(java.security.Certificate) throws java.security.KeyManagementException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#addCertificate(java.security.Certificate) public void
     *      java.security.Identity.addCertificate(java.security.Certificate) throws java.security.KeyManagementException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addCertificate_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#certificates() public java.security.Certificate[]
     * java.security.Identity.certificates()}.
     *
     * <p>
     * Test method for {@link java.security.Identity#certificates() public java.security.Certificate[]
     * java.security.Identity.certificates()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#certificates() public java.security.Certificate[]
     *      java.security.Identity.certificates() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_certificates()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#equals(Object) public final boolean
     * java.security.Identity.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Identity#equals(Object) public final boolean
     * java.security.Identity.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#equals(Object) public final boolean java.security.Identity.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#hashCode() public int java.security.Identity.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.Identity#hashCode() public int java.security.Identity.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#hashCode() public int java.security.Identity.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#setInfo(String) public void
     * java.security.Identity.setInfo(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.Identity#setInfo(String) public void
     * java.security.Identity.setInfo(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#setInfo(String) public void java.security.Identity.setInfo(java.lang.String) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setInfo_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#toString() public java.lang.String
     * java.security.Identity.toString()}.
     *
     * <p>
     * Test method for {@link java.security.Identity#toString() public java.lang.String
     * java.security.Identity.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#toString() public java.lang.String java.security.Identity.toString() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.Identity#toString(boolean) public java.lang.String
     * java.security.Identity.toString(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.Identity#toString(boolean) public java.lang.String
     * java.security.Identity.toString(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#toString(boolean) public java.lang.String java.security.Identity.toString(boolean)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#removeCertificate(java.security.Certificate) public void
     * java.security.Identity.removeCertificate(java.security.Certificate) throws java.security.KeyManagementException}.
     *
     * <p>
     * Test method for {@link java.security.Identity#removeCertificate(java.security.Certificate) public void
     * java.security.Identity.removeCertificate(java.security.Certificate) throws java.security.KeyManagementException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#removeCertificate(java.security.Certificate) public void
     *      java.security.Identity.removeCertificate(java.security.Certificate) throws
     *      java.security.KeyManagementException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeCertificate_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Identity#getScope() public final java.security.IdentityScope
     * java.security.Identity.getScope()}.
     *
     * <p>
     * Test method for {@link java.security.Identity#getScope() public final java.security.IdentityScope
     * java.security.Identity.getScope()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Identity#getScope() public final java.security.IdentityScope java.security.Identity.getScope()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScope()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
