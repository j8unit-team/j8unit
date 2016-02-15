package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.kerberos.KerberosTicket class
 * javax.security.auth.kerberos.KerberosTicket}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link KerberosTicketClassTests}.
 * </p>
 *
 * @see javax.security.auth.kerberos.KerberosTicket class javax.security.auth.kerberos.KerberosTicket (the hereby
 *      targeted class-under-test class)
 * @see KerberosTicketClassTests KerberosTicketClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KerberosTicketTests<SUT extends javax.security.auth.kerberos.KerberosTicket>
extends org.j8unit.repository.javax.security.auth.DestroyableTests<SUT>, org.j8unit.repository.javax.security.auth.RefreshableTests<SUT>,
org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getClient() public final
     * javax.security.auth.kerberos.KerberosPrincipal javax.security.auth.kerberos.KerberosTicket.getClient()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getClient() public final
     * javax.security.auth.kerberos.KerberosPrincipal javax.security.auth.kerberos.KerberosTicket.getClient()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getClient() public final
     *      javax.security.auth.kerberos.KerberosPrincipal javax.security.auth.kerberos.KerberosTicket.getClient() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClient()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#destroy() public void
     * javax.security.auth.kerberos.KerberosTicket.destroy() throws javax.security.auth.DestroyFailedException}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#destroy() public void
     * javax.security.auth.kerberos.KerberosTicket.destroy() throws javax.security.auth.DestroyFailedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#destroy() public void
     *      javax.security.auth.kerberos.KerberosTicket.destroy() throws javax.security.auth.DestroyFailedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#refresh() public void
     * javax.security.auth.kerberos.KerberosTicket.refresh() throws javax.security.auth.RefreshFailedException}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#refresh() public void
     * javax.security.auth.kerberos.KerberosTicket.refresh() throws javax.security.auth.RefreshFailedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#refresh() public void
     *      javax.security.auth.kerberos.KerberosTicket.refresh() throws javax.security.auth.RefreshFailedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_refresh()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isInitial() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isInitial()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isInitial() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isInitial()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isInitial() public final boolean
     *      javax.security.auth.kerberos.KerberosTicket.isInitial() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInitial()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isProxy() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isProxy()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isProxy() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isProxy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isProxy() public final boolean
     *      javax.security.auth.kerberos.KerberosTicket.isProxy() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isProxy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isProxiable() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isProxiable()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isProxiable() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isProxiable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isProxiable() public final boolean
     *      javax.security.auth.kerberos.KerberosTicket.isProxiable() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isProxiable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getServer() public final
     * javax.security.auth.kerberos.KerberosPrincipal javax.security.auth.kerberos.KerberosTicket.getServer()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getServer() public final
     * javax.security.auth.kerberos.KerberosPrincipal javax.security.auth.kerberos.KerberosTicket.getServer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getServer() public final
     *      javax.security.auth.kerberos.KerberosPrincipal javax.security.auth.kerberos.KerberosTicket.getServer() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isDestroyed() public boolean
     * javax.security.auth.kerberos.KerberosTicket.isDestroyed()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isDestroyed() public boolean
     * javax.security.auth.kerberos.KerberosTicket.isDestroyed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isDestroyed() public boolean
     *      javax.security.auth.kerberos.KerberosTicket.isDestroyed() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDestroyed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getEncoded() public final byte[]
     * javax.security.auth.kerberos.KerberosTicket.getEncoded()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getEncoded() public final byte[]
     * javax.security.auth.kerberos.KerberosTicket.getEncoded()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getEncoded() public final byte[]
     *      javax.security.auth.kerberos.KerberosTicket.getEncoded() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getSessionKeyType() public final int
     * javax.security.auth.kerberos.KerberosTicket.getSessionKeyType()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getSessionKeyType() public final int
     * javax.security.auth.kerberos.KerberosTicket.getSessionKeyType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getSessionKeyType() public final int
     *      javax.security.auth.kerberos.KerberosTicket.getSessionKeyType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSessionKeyType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#toString() public java.lang.String
     * javax.security.auth.kerberos.KerberosTicket.toString()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#toString() public java.lang.String
     * javax.security.auth.kerberos.KerberosTicket.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#toString() public java.lang.String
     *      javax.security.auth.kerberos.KerberosTicket.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getFlags() public final boolean[]
     * javax.security.auth.kerberos.KerberosTicket.getFlags()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getFlags() public final boolean[]
     * javax.security.auth.kerberos.KerberosTicket.getFlags()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getFlags() public final boolean[]
     *      javax.security.auth.kerberos.KerberosTicket.getFlags() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlags()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getAuthTime() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getAuthTime()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getAuthTime() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getAuthTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getAuthTime() public final java.util.Date
     *      javax.security.auth.kerberos.KerberosTicket.getAuthTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAuthTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isCurrent() public boolean
     * javax.security.auth.kerberos.KerberosTicket.isCurrent()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isCurrent() public boolean
     * javax.security.auth.kerberos.KerberosTicket.isCurrent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isCurrent() public boolean
     *      javax.security.auth.kerberos.KerberosTicket.isCurrent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isCurrent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#equals(Object) public boolean
     * javax.security.auth.kerberos.KerberosTicket.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#equals(Object) public boolean
     * javax.security.auth.kerberos.KerberosTicket.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#equals(Object) public boolean
     *      javax.security.auth.kerberos.KerberosTicket.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getStartTime() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getStartTime()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getStartTime() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getStartTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getStartTime() public final java.util.Date
     *      javax.security.auth.kerberos.KerberosTicket.getStartTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStartTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getClientAddresses() public final
     * java.net.InetAddress[] javax.security.auth.kerberos.KerberosTicket.getClientAddresses()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getClientAddresses() public final
     * java.net.InetAddress[] javax.security.auth.kerberos.KerberosTicket.getClientAddresses()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getClientAddresses() public final java.net.InetAddress[]
     *      javax.security.auth.kerberos.KerberosTicket.getClientAddresses() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClientAddresses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isForwarded() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isForwarded()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isForwarded() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isForwarded()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isForwarded() public final boolean
     *      javax.security.auth.kerberos.KerberosTicket.isForwarded() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isForwarded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isRenewable() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isRenewable()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isRenewable() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isRenewable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isRenewable() public final boolean
     *      javax.security.auth.kerberos.KerberosTicket.isRenewable() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRenewable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getEndTime() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getEndTime()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getEndTime() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getEndTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getEndTime() public final java.util.Date
     *      javax.security.auth.kerberos.KerberosTicket.getEndTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEndTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isPostdated() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isPostdated()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isPostdated() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isPostdated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isPostdated() public final boolean
     *      javax.security.auth.kerberos.KerberosTicket.isPostdated() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPostdated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getSessionKey() public final
     * javax.crypto.SecretKey javax.security.auth.kerberos.KerberosTicket.getSessionKey()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getSessionKey() public final
     * javax.crypto.SecretKey javax.security.auth.kerberos.KerberosTicket.getSessionKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getSessionKey() public final javax.crypto.SecretKey
     *      javax.security.auth.kerberos.KerberosTicket.getSessionKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSessionKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isForwardable() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isForwardable()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#isForwardable() public final boolean
     * javax.security.auth.kerberos.KerberosTicket.isForwardable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#isForwardable() public final boolean
     *      javax.security.auth.kerberos.KerberosTicket.isForwardable() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isForwardable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#hashCode() public int
     * javax.security.auth.kerberos.KerberosTicket.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#hashCode() public int
     * javax.security.auth.kerberos.KerberosTicket.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#hashCode() public int
     *      javax.security.auth.kerberos.KerberosTicket.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getRenewTill() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getRenewTill()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosTicket#getRenewTill() public final java.util.Date
     * javax.security.auth.kerberos.KerberosTicket.getRenewTill()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosTicket#getRenewTill() public final java.util.Date
     *      javax.security.auth.kerberos.KerberosTicket.getRenewTill() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRenewTill()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
