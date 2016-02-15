package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.ietf.jgss.GSSManager class org.ietf.jgss.GSSManager}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link GSSManagerClassTests}.
 * </p>
 *
 * @see org.ietf.jgss.GSSManager class org.ietf.jgss.GSSManager (the hereby targeted class-under-test class)
 * @see GSSManagerClassTests GSSManagerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GSSManagerTests<SUT extends org.ietf.jgss.GSSManager>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createContext(org.ietf.jgss.GSSCredential) public abstract
     * org.ietf.jgss.GSSContext org.ietf.jgss.GSSManager.createContext(org.ietf.jgss.GSSCredential) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createContext(org.ietf.jgss.GSSCredential) public abstract
     * org.ietf.jgss.GSSContext org.ietf.jgss.GSSManager.createContext(org.ietf.jgss.GSSCredential) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#createContext(org.ietf.jgss.GSSCredential) public abstract org.ietf.jgss.GSSContext
     *      org.ietf.jgss.GSSManager.createContext(org.ietf.jgss.GSSCredential) throws org.ietf.jgss.GSSException (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link org.ietf.jgss.GSSManager#createContext(org.ietf.jgss.GSSName, org.ietf.jgss.Oid, org.ietf.jgss.GSSCredential, int)
     * public abstract org.ietf.jgss.GSSContext
     * org.ietf.jgss.GSSManager.createContext(org.ietf.jgss.GSSName,org.ietf.jgss.Oid,org.ietf.jgss.GSSCredential,int)
     * throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for
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
     * @see org.ietf.jgss.GSSManager#createContext(org.ietf.jgss.GSSName, org.ietf.jgss.Oid,
     *      org.ietf.jgss.GSSCredential, int) public abstract org.ietf.jgss.GSSContext
     *      org.ietf.jgss.GSSManager.createContext(org.ietf.jgss.GSSName,org.ietf.jgss.Oid,org.ietf.jgss.GSSCredential,
     *      int) throws org.ietf.jgss.GSSException (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#createContext(byte[]) public abstract org.ietf.jgss.GSSContext
     * org.ietf.jgss.GSSManager.createContext(byte[]) throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createContext(byte[]) public abstract org.ietf.jgss.GSSContext
     * org.ietf.jgss.GSSManager.createContext(byte[]) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#createContext(byte[]) public abstract org.ietf.jgss.GSSContext
     *      org.ietf.jgss.GSSManager.createContext(byte[]) throws org.ietf.jgss.GSSException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#getMechs() public abstract org.ietf.jgss.Oid[]
     * org.ietf.jgss.GSSManager.getMechs()}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#getMechs() public abstract org.ietf.jgss.Oid[]
     * org.ietf.jgss.GSSManager.getMechs()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#getMechs() public abstract org.ietf.jgss.Oid[] org.ietf.jgss.GSSManager.getMechs()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#addProviderAtEnd(java.security.Provider, org.ietf.jgss.Oid)
     * public abstract void org.ietf.jgss.GSSManager.addProviderAtEnd(java.security.Provider,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#addProviderAtEnd(java.security.Provider, org.ietf.jgss.Oid)
     * public abstract void org.ietf.jgss.GSSManager.addProviderAtEnd(java.security.Provider,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#addProviderAtEnd(java.security.Provider, org.ietf.jgss.Oid) public abstract void
     *      org.ietf.jgss.GSSManager.addProviderAtEnd(java.security.Provider,org.ietf.jgss.Oid) throws
     *      org.ietf.jgss.GSSException (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#getMechsForName(org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.Oid[] org.ietf.jgss.GSSManager.getMechsForName(org.ietf.jgss.Oid)}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#getMechsForName(org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.Oid[] org.ietf.jgss.GSSManager.getMechsForName(org.ietf.jgss.Oid)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#getMechsForName(org.ietf.jgss.Oid) public abstract org.ietf.jgss.Oid[]
     *      org.ietf.jgss.GSSManager.getMechsForName(org.ietf.jgss.Oid) (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#createCredential(int) public abstract org.ietf.jgss.GSSCredential
     * org.ietf.jgss.GSSManager.createCredential(int) throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createCredential(int) public abstract org.ietf.jgss.GSSCredential
     * org.ietf.jgss.GSSManager.createCredential(int) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#createCredential(int) public abstract org.ietf.jgss.GSSCredential
     *      org.ietf.jgss.GSSManager.createCredential(int) throws org.ietf.jgss.GSSException (the hereby targeted
     *      method-under-test)
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
     * Test method for
     * {@link org.ietf.jgss.GSSManager#createCredential(org.ietf.jgss.GSSName, int, org.ietf.jgss.Oid[], int) public
     * abstract org.ietf.jgss.GSSCredential
     * org.ietf.jgss.GSSManager.createCredential(org.ietf.jgss.GSSName,int,org.ietf.jgss.Oid[],int) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for
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
     * @see org.ietf.jgss.GSSManager#createCredential(org.ietf.jgss.GSSName, int, org.ietf.jgss.Oid[], int) public
     *      abstract org.ietf.jgss.GSSCredential
     *      org.ietf.jgss.GSSManager.createCredential(org.ietf.jgss.GSSName,int,org.ietf.jgss.Oid[],int) throws
     *      org.ietf.jgss.GSSException (the hereby targeted method-under-test)
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
     * Test method for
     * {@link org.ietf.jgss.GSSManager#createCredential(org.ietf.jgss.GSSName, int, org.ietf.jgss.Oid, int) public
     * abstract org.ietf.jgss.GSSCredential
     * org.ietf.jgss.GSSManager.createCredential(org.ietf.jgss.GSSName,int,org.ietf.jgss.Oid,int) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for
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
     * @see org.ietf.jgss.GSSManager#createCredential(org.ietf.jgss.GSSName, int, org.ietf.jgss.Oid, int) public
     *      abstract org.ietf.jgss.GSSCredential
     *      org.ietf.jgss.GSSManager.createCredential(org.ietf.jgss.GSSName,int,org.ietf.jgss.Oid,int) throws
     *      org.ietf.jgss.GSSException (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid, org.ietf.jgss.Oid) public
     * abstract org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid,org.ietf.jgss.Oid)
     * throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid, org.ietf.jgss.Oid) public
     * abstract org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid,org.ietf.jgss.Oid)
     * throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid, org.ietf.jgss.Oid) public abstract
     *      org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid,org.ietf.jgss.Oid) throws
     *      org.ietf.jgss.GSSException (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid, org.ietf.jgss.Oid) public
     * abstract org.ietf.jgss.GSSName
     * org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid, org.ietf.jgss.Oid) public
     * abstract org.ietf.jgss.GSSName
     * org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid, org.ietf.jgss.Oid) public abstract
     *      org.ietf.jgss.GSSName
     *      org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid,org.ietf.jgss.Oid) throws
     *      org.ietf.jgss.GSSException (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#createName(byte[], org.ietf.jgss.Oid) public abstract org.ietf.jgss.GSSName
     *      org.ietf.jgss.GSSManager.createName(byte[],org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#createName(String, org.ietf.jgss.Oid) public abstract org.ietf.jgss.GSSName
     *      org.ietf.jgss.GSSManager.createName(java.lang.String,org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#addProviderAtFront(java.security.Provider, org.ietf.jgss.Oid)
     * public abstract void org.ietf.jgss.GSSManager.addProviderAtFront(java.security.Provider,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#addProviderAtFront(java.security.Provider, org.ietf.jgss.Oid)
     * public abstract void org.ietf.jgss.GSSManager.addProviderAtFront(java.security.Provider,org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#addProviderAtFront(java.security.Provider, org.ietf.jgss.Oid) public abstract void
     *      org.ietf.jgss.GSSManager.addProviderAtFront(java.security.Provider,org.ietf.jgss.Oid) throws
     *      org.ietf.jgss.GSSException (the hereby targeted method-under-test)
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
     * Test method for {@link org.ietf.jgss.GSSManager#getNamesForMech(org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.Oid[] org.ietf.jgss.GSSManager.getNamesForMech(org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSManager#getNamesForMech(org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.Oid[] org.ietf.jgss.GSSManager.getNamesForMech(org.ietf.jgss.Oid) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSManager#getNamesForMech(org.ietf.jgss.Oid) public abstract org.ietf.jgss.Oid[]
     *      org.ietf.jgss.GSSManager.getNamesForMech(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException (the hereby
     *      targeted method-under-test)
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

}
