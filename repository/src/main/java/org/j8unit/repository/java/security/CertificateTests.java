package org.j8unit.repository.java.security;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.Certificate interface java.security.Certificate}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CertificateClassTests}.
 * </p>
 *
 * @see java.security.Certificate interface java.security.Certificate (the hereby targeted class-under-test class)
 * @see CertificateClassTests CertificateClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateTests<SUT extends java.security.Certificate>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Certificate#decode(java.io.InputStream) public abstract void
     * java.security.Certificate.decode(java.io.InputStream) throws java.security.KeyException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.Certificate#decode(java.io.InputStream) public abstract void
     * java.security.Certificate.decode(java.io.InputStream) throws java.security.KeyException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Certificate#decode(java.io.InputStream) public abstract void
     *      java.security.Certificate.decode(java.io.InputStream) throws java.security.KeyException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decode_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Certificate#toString(boolean) public abstract java.lang.String
     * java.security.Certificate.toString(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.Certificate#toString(boolean) public abstract java.lang.String
     * java.security.Certificate.toString(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Certificate#toString(boolean) public abstract java.lang.String
     *      java.security.Certificate.toString(boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Certificate#getFormat() public abstract java.lang.String
     * java.security.Certificate.getFormat()}.
     *
     * <p>
     * Test method for {@link java.security.Certificate#getFormat() public abstract java.lang.String
     * java.security.Certificate.getFormat()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Certificate#getFormat() public abstract java.lang.String java.security.Certificate.getFormat()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Certificate#getGuarantor() public abstract java.security.Principal
     * java.security.Certificate.getGuarantor()}.
     *
     * <p>
     * Test method for {@link java.security.Certificate#getGuarantor() public abstract java.security.Principal
     * java.security.Certificate.getGuarantor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Certificate#getGuarantor() public abstract java.security.Principal
     *      java.security.Certificate.getGuarantor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGuarantor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Certificate#getPublicKey() public abstract java.security.PublicKey
     * java.security.Certificate.getPublicKey()}.
     *
     * <p>
     * Test method for {@link java.security.Certificate#getPublicKey() public abstract java.security.PublicKey
     * java.security.Certificate.getPublicKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Certificate#getPublicKey() public abstract java.security.PublicKey
     *      java.security.Certificate.getPublicKey() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.Certificate#encode(java.io.OutputStream) public abstract void
     * java.security.Certificate.encode(java.io.OutputStream) throws java.security.KeyException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.Certificate#encode(java.io.OutputStream) public abstract void
     * java.security.Certificate.encode(java.io.OutputStream) throws java.security.KeyException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Certificate#encode(java.io.OutputStream) public abstract void
     *      java.security.Certificate.encode(java.io.OutputStream) throws java.security.KeyException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_encode_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Certificate#getPrincipal() public abstract java.security.Principal
     * java.security.Certificate.getPrincipal()}.
     *
     * <p>
     * Test method for {@link java.security.Certificate#getPrincipal() public abstract java.security.Principal
     * java.security.Certificate.getPrincipal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Certificate#getPrincipal() public abstract java.security.Principal
     *      java.security.Certificate.getPrincipal() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
