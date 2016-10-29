package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link GSSManager
 * public abstract class org.ietf.jgss.GSSManager}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.ietf.jgss.GSSManagerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GSSManagerTests<SUT extends GSSManager>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.GSSManager]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.ietf.jgss.GSSManager#getMechs() public abstract
     * org.ietf.jgss.Oid[] org.ietf.jgss.GSSManager.getMechs()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMechs()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.ietf.jgss.GSSManager#createContext(byte[])
     * public abstract org.ietf.jgss.GSSContext org.ietf.jgss.GSSManager.createContext(byte[]) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createContext_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createContext(org.ietf.jgss.GSSName, org.ietf.jgss.Oid, org.ietf.jgss.GSSCredential, int)
     * public abstract org.ietf.jgss.GSSContext
     * org.ietf.jgss.GSSManager.createContext(org.ietf.jgss.GSSName,org.ietf.jgss.Oid,org.ietf.jgss.GSSCredential,int)
     * throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createContext_GSSName_Oid_GSSCredential_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createContext(org.ietf.jgss.GSSCredential) public abstract
     * org.ietf.jgss.GSSContext org.ietf.jgss.GSSManager.createContext(org.ietf.jgss.GSSCredential) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createContext_GSSCredential()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#addProviderAtEnd(java.security.Provider, org.ietf.jgss.Oid) public abstract void
     * org.ietf.jgss.GSSManager.addProviderAtEnd(java.security.Provider,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addProviderAtEnd_Provider_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#getMechsForName(org.ietf.jgss.Oid) public abstract org.ietf.jgss.Oid[]
     * org.ietf.jgss.GSSManager.getMechsForName(org.ietf.jgss.Oid)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMechsForName_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createCredential(org.ietf.jgss.GSSName, int, org.ietf.jgss.Oid, int) public
     * abstract org.ietf.jgss.GSSCredential
     * org.ietf.jgss.GSSManager.createCredential(org.ietf.jgss.GSSName,int,org.ietf.jgss.Oid,int) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCredential_GSSName_int_Oid_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createCredential(org.ietf.jgss.GSSName, int, org.ietf.jgss.Oid[], int) public
     * abstract org.ietf.jgss.GSSCredential
     * org.ietf.jgss.GSSManager.createCredential(org.ietf.jgss.GSSName,int,org.ietf.jgss.Oid[],int) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCredential_GSSName_int_OidArray_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.ietf.jgss.GSSManager#createCredential(int)
     * public abstract org.ietf.jgss.GSSCredential org.ietf.jgss.GSSManager.createCredential(int) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCredential_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid, org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createName_byteArray_Oid_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid, org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid,org.ietf.jgss.Oid)
     * throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createName_String_Oid_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid) public abstract org.ietf.jgss.GSSName
     * org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createName_byteArray_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid) public abstract org.ietf.jgss.GSSName
     * org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createName_String_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#addProviderAtFront(java.security.Provider, org.ietf.jgss.Oid) public abstract
     * void org.ietf.jgss.GSSManager.addProviderAtFront(java.security.Provider,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addProviderAtFront_Provider_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.ietf.jgss.GSSManager#getNamesForMech(org.ietf.jgss.Oid) public abstract org.ietf.jgss.Oid[]
     * org.ietf.jgss.GSSManager.getNamesForMech(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamesForMech_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.ietf.jgss.GSSManager]

}
