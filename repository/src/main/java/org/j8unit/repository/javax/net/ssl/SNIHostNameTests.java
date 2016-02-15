package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SNIHostName class javax.net.ssl.SNIHostName}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SNIHostNameClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SNIHostName class javax.net.ssl.SNIHostName (the hereby targeted class-under-test class)
 * @see SNIHostNameClassTests SNIHostNameClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SNIHostNameTests<SUT extends javax.net.ssl.SNIHostName>
extends SNIServerNameTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SNIHostName#getAsciiName() public java.lang.String
     * javax.net.ssl.SNIHostName.getAsciiName()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SNIHostName#getAsciiName() public java.lang.String
     * javax.net.ssl.SNIHostName.getAsciiName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SNIHostName#getAsciiName() public java.lang.String javax.net.ssl.SNIHostName.getAsciiName()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAsciiName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SNIHostName#equals(Object) public boolean
     * javax.net.ssl.SNIHostName.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SNIHostName#equals(Object) public boolean
     * javax.net.ssl.SNIHostName.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SNIHostName#equals(Object) public boolean javax.net.ssl.SNIHostName.equals(java.lang.Object)
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
     * Test method for {@link javax.net.ssl.SNIHostName#hashCode() public int javax.net.ssl.SNIHostName.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SNIHostName#hashCode() public int javax.net.ssl.SNIHostName.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SNIHostName#hashCode() public int javax.net.ssl.SNIHostName.hashCode() (the hereby targeted
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
     * Test method for {@link javax.net.ssl.SNIHostName#toString() public java.lang.String
     * javax.net.ssl.SNIHostName.toString()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SNIHostName#toString() public java.lang.String
     * javax.net.ssl.SNIHostName.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SNIHostName#toString() public java.lang.String javax.net.ssl.SNIHostName.toString() (the
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

}
