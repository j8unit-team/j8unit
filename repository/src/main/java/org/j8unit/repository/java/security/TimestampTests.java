package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.Timestamp class java.security.Timestamp}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link TimestampClassTests}.
 * </p>
 *
 * @see java.security.Timestamp class java.security.Timestamp (the hereby targeted class-under-test class)
 * @see TimestampClassTests TimestampClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimestampTests<SUT extends java.security.Timestamp>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Timestamp#toString() public java.lang.String
     * java.security.Timestamp.toString()}.
     *
     * <p>
     * Test method for {@link java.security.Timestamp#toString() public java.lang.String
     * java.security.Timestamp.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Timestamp#toString() public java.lang.String java.security.Timestamp.toString() (the hereby
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
     * Test method for {@link java.security.Timestamp#hashCode() public int java.security.Timestamp.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.Timestamp#hashCode() public int java.security.Timestamp.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Timestamp#hashCode() public int java.security.Timestamp.hashCode() (the hereby targeted
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
     * Test method for {@link java.security.Timestamp#getTimestamp() public java.util.Date
     * java.security.Timestamp.getTimestamp()}.
     *
     * <p>
     * Test method for {@link java.security.Timestamp#getTimestamp() public java.util.Date
     * java.security.Timestamp.getTimestamp()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Timestamp#getTimestamp() public java.util.Date java.security.Timestamp.getTimestamp() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTimestamp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Timestamp#equals(Object) public boolean
     * java.security.Timestamp.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.Timestamp#equals(Object) public boolean
     * java.security.Timestamp.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Timestamp#equals(Object) public boolean java.security.Timestamp.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.security.Timestamp#getSignerCertPath() public java.security.cert.CertPath
     * java.security.Timestamp.getSignerCertPath()}.
     *
     * <p>
     * Test method for {@link java.security.Timestamp#getSignerCertPath() public java.security.cert.CertPath
     * java.security.Timestamp.getSignerCertPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Timestamp#getSignerCertPath() public java.security.cert.CertPath
     *      java.security.Timestamp.getSignerCertPath() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignerCertPath()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
