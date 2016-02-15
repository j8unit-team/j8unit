package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertPath class java.security.cert.CertPath}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CertPathClassTests}.
 * </p>
 *
 * @see java.security.cert.CertPath class java.security.cert.CertPath (the hereby targeted class-under-test class)
 * @see CertPathClassTests CertPathClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathTests<SUT extends java.security.cert.CertPath>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPath#toString() public java.lang.String
     * java.security.cert.CertPath.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#toString() public java.lang.String
     * java.security.cert.CertPath.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#toString() public java.lang.String java.security.cert.CertPath.toString() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.CertPath#getCertificates() public abstract java.util.List<? extends
     * java.security.cert.Certificate> java.security.cert.CertPath.getCertificates()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#getCertificates() public abstract java.util.List
     * java.security.cert.CertPath.getCertificates()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#getCertificates() public abstract java.util.List
     *      java.security.cert.CertPath.getCertificates() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificates()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPath#getEncodings() public abstract java.util.Iterator
     * <java.lang.String> java.security.cert.CertPath.getEncodings()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#getEncodings() public abstract java.util.Iterator
     * java.security.cert.CertPath.getEncodings()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#getEncodings() public abstract java.util.Iterator
     *      java.security.cert.CertPath.getEncodings() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncodings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPath#equals(Object) public boolean
     * java.security.cert.CertPath.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#equals(Object) public boolean
     * java.security.cert.CertPath.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#equals(Object) public boolean
     *      java.security.cert.CertPath.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.CertPath#hashCode() public int java.security.cert.CertPath.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#hashCode() public int java.security.cert.CertPath.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#hashCode() public int java.security.cert.CertPath.hashCode() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.cert.CertPath#getEncoded(String) public abstract byte[]
     * java.security.cert.CertPath.getEncoded(java.lang.String) throws java.security.cert.CertificateEncodingException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#getEncoded(String) public abstract byte[]
     * java.security.cert.CertPath.getEncoded(java.lang.String) throws java.security.cert.CertificateEncodingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#getEncoded(String) public abstract byte[]
     *      java.security.cert.CertPath.getEncoded(java.lang.String) throws
     *      java.security.cert.CertificateEncodingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoded_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPath#getEncoded() public abstract byte[]
     * java.security.cert.CertPath.getEncoded() throws java.security.cert.CertificateEncodingException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#getEncoded() public abstract byte[]
     * java.security.cert.CertPath.getEncoded() throws java.security.cert.CertificateEncodingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#getEncoded() public abstract byte[] java.security.cert.CertPath.getEncoded()
     *      throws java.security.cert.CertificateEncodingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPath#getType() public java.lang.String
     * java.security.cert.CertPath.getType()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPath#getType() public java.lang.String
     * java.security.cert.CertPath.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPath#getType() public java.lang.String java.security.cert.CertPath.getType() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
