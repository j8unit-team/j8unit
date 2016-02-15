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
 * non-{@code static} methods) of {@linkplain java.security.KeyStore class java.security.KeyStore}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link KeyStoreClassTests}.
 * </p>
 *
 * @see java.security.KeyStore class java.security.KeyStore (the hereby targeted class-under-test class)
 * @see KeyStoreClassTests KeyStoreClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyStoreTests<SUT extends java.security.KeyStore>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#store(java.security.KeyStore.LoadStoreParameter) public final void
     * java.security.KeyStore.store(java.security.KeyStore$LoadStoreParameter) throws
     * java.security.KeyStoreException,java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}
     * .
     *
     * <p>
     * Test method for {@link java.security.KeyStore#store(java.security.KeyStore.LoadStoreParameter) public final void
     * java.security.KeyStore.store(java.security.KeyStore$LoadStoreParameter) throws
     * java.security.KeyStoreException,java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#store(java.security.KeyStore.LoadStoreParameter) public final void
     *      java.security.KeyStore.store(java.security.KeyStore$LoadStoreParameter) throws
     *      java.security.KeyStoreException,java.io.IOException,java.security.NoSuchAlgorithmException,java.security.
     *      cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_store_LoadStoreParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#store(java.io.OutputStream, char[]) public final void
     * java.security.KeyStore.store(java.io.OutputStream,char[]) throws
     * java.security.KeyStoreException,java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}
     * .
     *
     * <p>
     * Test method for {@link java.security.KeyStore#store(java.io.OutputStream, char[]) public final void
     * java.security.KeyStore.store(java.io.OutputStream,char[]) throws
     * java.security.KeyStoreException,java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#store(java.io.OutputStream, char[]) public final void
     *      java.security.KeyStore.store(java.io.OutputStream,char[]) throws
     *      java.security.KeyStoreException,java.io.IOException,java.security.NoSuchAlgorithmException,java.security.
     *      cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_store_OutputStream_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#containsAlias(String) public final boolean
     * java.security.KeyStore.containsAlias(java.lang.String) throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#containsAlias(String) public final boolean
     * java.security.KeyStore.containsAlias(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#containsAlias(String) public final boolean
     *      java.security.KeyStore.containsAlias(java.lang.String) throws java.security.KeyStoreException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsAlias_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#aliases() public final java.util.Enumeration
     * <java.lang.String> java.security.KeyStore.aliases() throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#aliases() public final java.util.Enumeration
     * java.security.KeyStore.aliases() throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#aliases() public final java.util.Enumeration java.security.KeyStore.aliases() throws
     *      java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_aliases()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getCertificateAlias(java.security.cert.Certificate) public final
     * java.lang.String java.security.KeyStore.getCertificateAlias(java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getCertificateAlias(java.security.cert.Certificate) public final
     * java.lang.String java.security.KeyStore.getCertificateAlias(java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getCertificateAlias(java.security.cert.Certificate) public final java.lang.String
     *      java.security.KeyStore.getCertificateAlias(java.security.cert.Certificate) throws
     *      java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificateAlias_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getKey(String, char[]) public final java.security.Key
     * java.security.KeyStore.getKey(java.lang.String,char[]) throws
     * java.security.KeyStoreException,java.security.NoSuchAlgorithmException,java.security.UnrecoverableKeyException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getKey(String, char[]) public final java.security.Key
     * java.security.KeyStore.getKey(java.lang.String,char[]) throws
     * java.security.KeyStoreException,java.security.NoSuchAlgorithmException,java.security.UnrecoverableKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getKey(String, char[]) public final java.security.Key
     *      java.security.KeyStore.getKey(java.lang.String,char[]) throws
     *      java.security.KeyStoreException,java.security.NoSuchAlgorithmException,java.security.
     *      UnrecoverableKeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKey_String_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getCertificateChain(String) public final
     * java.security.cert.Certificate[] java.security.KeyStore.getCertificateChain(java.lang.String) throws
     * java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getCertificateChain(String) public final
     * java.security.cert.Certificate[] java.security.KeyStore.getCertificateChain(java.lang.String) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getCertificateChain(String) public final java.security.cert.Certificate[]
     *      java.security.KeyStore.getCertificateChain(java.lang.String) throws java.security.KeyStoreException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificateChain_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#entryInstanceOf(String, Class) public final boolean
     * java.security.KeyStore.entryInstanceOf(java.lang.String,java.lang.Class<? extends java.security.KeyStore$Entry>)
     * throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#entryInstanceOf(String, Class) public final boolean
     * java.security.KeyStore.entryInstanceOf(java.lang.String,java.lang.Class) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#entryInstanceOf(String, Class) public final boolean
     *      java.security.KeyStore.entryInstanceOf(java.lang.String,java.lang.Class) throws
     *      java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_entryInstanceOf_String_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#isKeyEntry(String) public final boolean
     * java.security.KeyStore.isKeyEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#isKeyEntry(String) public final boolean
     * java.security.KeyStore.isKeyEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#isKeyEntry(String) public final boolean
     *      java.security.KeyStore.isKeyEntry(java.lang.String) throws java.security.KeyStoreException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isKeyEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getProvider() public final java.security.Provider
     * java.security.KeyStore.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getProvider() public final java.security.Provider
     * java.security.KeyStore.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getProvider() public final java.security.Provider
     *      java.security.KeyStore.getProvider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyStore#setEntry(String, java.security.KeyStore.Entry, java.security.KeyStore.ProtectionParameter)
     * public final void
     * java.security.KeyStore.setEntry(java.lang.String,java.security.KeyStore$Entry,java.security.KeyStore$ProtectionParameter)
     * throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyStore#setEntry(String, java.security.KeyStore.Entry, java.security.KeyStore.ProtectionParameter)
     * public final void
     * java.security.KeyStore.setEntry(java.lang.String,java.security.KeyStore$Entry,java.security.KeyStore$ProtectionParameter)
     * throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#setEntry(String, java.security.KeyStore.Entry,
     *      java.security.KeyStore.ProtectionParameter) public final void
     *      java.security.KeyStore.setEntry(java.lang.String,java.security.KeyStore$Entry,java.security.
     *      KeyStore$ProtectionParameter) throws java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEntry_String_Entry_ProtectionParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#setCertificateEntry(String, java.security.cert.Certificate) public
     * final void java.security.KeyStore.setCertificateEntry(java.lang.String,java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#setCertificateEntry(String, java.security.cert.Certificate) public
     * final void java.security.KeyStore.setCertificateEntry(java.lang.String,java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#setCertificateEntry(String, java.security.cert.Certificate) public final void
     *      java.security.KeyStore.setCertificateEntry(java.lang.String,java.security.cert.Certificate) throws
     *      java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCertificateEntry_String_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getEntry(String, java.security.KeyStore.ProtectionParameter) public
     * final java.security.KeyStore$Entry
     * java.security.KeyStore.getEntry(java.lang.String,java.security.KeyStore$ProtectionParameter) throws
     * java.security.NoSuchAlgorithmException,java.security.UnrecoverableEntryException,java.security.KeyStoreException}
     * .
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getEntry(String, java.security.KeyStore.ProtectionParameter) public
     * final java.security.KeyStore$Entry
     * java.security.KeyStore.getEntry(java.lang.String,java.security.KeyStore$ProtectionParameter) throws
     * java.security.NoSuchAlgorithmException,java.security.UnrecoverableEntryException,java.security.KeyStoreException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getEntry(String, java.security.KeyStore.ProtectionParameter) public final
     *      java.security.KeyStore$Entry
     *      java.security.KeyStore.getEntry(java.lang.String,java.security.KeyStore$ProtectionParameter) throws
     *      java.security.NoSuchAlgorithmException,java.security.UnrecoverableEntryException,java.security.
     *      KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEntry_String_ProtectionParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getCreationDate(String) public final java.util.Date
     * java.security.KeyStore.getCreationDate(java.lang.String) throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getCreationDate(String) public final java.util.Date
     * java.security.KeyStore.getCreationDate(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getCreationDate(String) public final java.util.Date
     *      java.security.KeyStore.getCreationDate(java.lang.String) throws java.security.KeyStoreException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCreationDate_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#isCertificateEntry(String) public final boolean
     * java.security.KeyStore.isCertificateEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#isCertificateEntry(String) public final boolean
     * java.security.KeyStore.isCertificateEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#isCertificateEntry(String) public final boolean
     *      java.security.KeyStore.isCertificateEntry(java.lang.String) throws java.security.KeyStoreException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCertificateEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#deleteEntry(String) public final void
     * java.security.KeyStore.deleteEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#deleteEntry(String) public final void
     * java.security.KeyStore.deleteEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#deleteEntry(String) public final void
     *      java.security.KeyStore.deleteEntry(java.lang.String) throws java.security.KeyStoreException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#size() public final int java.security.KeyStore.size() throws
     * java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#size() public final int java.security.KeyStore.size() throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#size() public final int java.security.KeyStore.size() throws
     *      java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#load(java.security.KeyStore.LoadStoreParameter) public final void
     * java.security.KeyStore.load(java.security.KeyStore$LoadStoreParameter) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#load(java.security.KeyStore.LoadStoreParameter) public final void
     * java.security.KeyStore.load(java.security.KeyStore$LoadStoreParameter) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#load(java.security.KeyStore.LoadStoreParameter) public final void
     *      java.security.KeyStore.load(java.security.KeyStore$LoadStoreParameter) throws
     *      java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_load_LoadStoreParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#load(java.io.InputStream, char[]) public final void
     * java.security.KeyStore.load(java.io.InputStream,char[]) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#load(java.io.InputStream, char[]) public final void
     * java.security.KeyStore.load(java.io.InputStream,char[]) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#load(java.io.InputStream, char[]) public final void
     *      java.security.KeyStore.load(java.io.InputStream,char[]) throws
     *      java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_load_InputStream_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getCertificate(String) public final java.security.cert.Certificate
     * java.security.KeyStore.getCertificate(java.lang.String) throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getCertificate(String) public final java.security.cert.Certificate
     * java.security.KeyStore.getCertificate(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getCertificate(String) public final java.security.cert.Certificate
     *      java.security.KeyStore.getCertificate(java.lang.String) throws java.security.KeyStoreException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificate_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getType() public final java.lang.String
     * java.security.KeyStore.getType()}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#getType() public final java.lang.String
     * java.security.KeyStore.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#getType() public final java.lang.String java.security.KeyStore.getType() (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyStore#setKeyEntry(String, java.security.Key, char[], java.security.cert.Certificate[])
     * public final void
     * java.security.KeyStore.setKeyEntry(java.lang.String,java.security.Key,char[],java.security.cert.Certificate[])
     * throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyStore#setKeyEntry(String, java.security.Key, char[], java.security.cert.Certificate[])
     * public final void
     * java.security.KeyStore.setKeyEntry(java.lang.String,java.security.Key,char[],java.security.cert.Certificate[])
     * throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#setKeyEntry(String, java.security.Key, char[], java.security.cert.Certificate[])
     *      public final void
     *      java.security.KeyStore.setKeyEntry(java.lang.String,java.security.Key,char[],java.security.cert.Certificate[
     *      ]) throws java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setKeyEntry_String_Key_charArray_CertificateArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#setKeyEntry(String, byte[], java.security.cert.Certificate[])
     * public final void java.security.KeyStore.setKeyEntry(java.lang.String,byte[],java.security.cert.Certificate[])
     * throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStore#setKeyEntry(String, byte[], java.security.cert.Certificate[])
     * public final void java.security.KeyStore.setKeyEntry(java.lang.String,byte[],java.security.cert.Certificate[])
     * throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStore#setKeyEntry(String, byte[], java.security.cert.Certificate[]) public final void
     *      java.security.KeyStore.setKeyEntry(java.lang.String,byte[],java.security.cert.Certificate[]) throws
     *      java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setKeyEntry_String_byteArray_CertificateArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.Entry interface java.security.KeyStore$Entry}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link KeyStoreClassTests.EntryClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.Entry interface java.security.KeyStore$Entry (the hereby targeted class-under-test
     *      class)
     * @see KeyStoreClassTests.EntryClassTests KeyStoreClassTests.EntryClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EntryTests<SUT extends java.security.KeyStore.Entry>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.Entry#getAttributes() public default java.util.Set
         * <java.security.KeyStore$Entry$Attribute> java.security.KeyStore$Entry.getAttributes()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.Entry#getAttributes() public default java.util.Set
         * java.security.KeyStore$Entry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.Entry#getAttributes() public default java.util.Set
         *      java.security.KeyStore$Entry.getAttributes() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAttributes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting
         * the non-{@code static} methods) of {@linkplain java.security.KeyStore.Entry.Attribute interface
         * java.security.KeyStore$Entry$Attribute}. The complementary j8unit test interface containing the class
         * relevant aspects is {@link KeyStoreClassTests.EntryClassTests.AttributeClassTests}.
         * </p>
         *
         * @see java.security.KeyStore.Entry.Attribute interface java.security.KeyStore$Entry$Attribute (the hereby
         *      targeted class-under-test class)
         * @see KeyStoreClassTests.EntryClassTests.AttributeClassTests
         *      KeyStoreClassTests.EntryClassTests.AttributeClassTests (the complementary j8unit test interface
         *      containing the class relevant test methods)
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface AttributeTests<SUT extends java.security.KeyStore.Entry.Attribute>
        extends RepositoryTests<SUT> {

            /**
             * <p>
             * Test method for {@link java.security.KeyStore.Entry.Attribute#getValue() public abstract java.lang.String
             * java.security.KeyStore$Entry$Attribute.getValue()}.
             *
             * <p>
             * Test method for {@link java.security.KeyStore.Entry.Attribute#getValue() public abstract java.lang.String
             * java.security.KeyStore$Entry$Attribute.getValue()}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @see java.security.KeyStore.Entry.Attribute#getValue() public abstract java.lang.String
             *      java.security.KeyStore$Entry$Attribute.getValue() (the hereby targeted method-under-test)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void test_getValue()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for {@link java.security.KeyStore.Entry.Attribute#getName() public abstract java.lang.String
             * java.security.KeyStore$Entry$Attribute.getName()}.
             *
             * <p>
             * Test method for {@link java.security.KeyStore.Entry.Attribute#getName() public abstract java.lang.String
             * java.security.KeyStore$Entry$Attribute.getName()}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @see java.security.KeyStore.Entry.Attribute#getName() public abstract java.lang.String
             *      java.security.KeyStore$Entry$Attribute.getName() (the hereby targeted method-under-test)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void test_getName()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.PrivateKeyEntry class
     * java.security.KeyStore$PrivateKeyEntry}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link KeyStoreClassTests.PrivateKeyEntryClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.PrivateKeyEntry class java.security.KeyStore$PrivateKeyEntry (the hereby targeted
     *      class-under-test class)
     * @see KeyStoreClassTests.PrivateKeyEntryClassTests KeyStoreClassTests.PrivateKeyEntryClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PrivateKeyEntryTests<SUT extends java.security.KeyStore.PrivateKeyEntry>
    extends KeyStoreTests.EntryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#toString() public java.lang.String
         * java.security.KeyStore$PrivateKeyEntry.toString()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#toString() public java.lang.String
         * java.security.KeyStore$PrivateKeyEntry.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PrivateKeyEntry#toString() public java.lang.String
         *      java.security.KeyStore$PrivateKeyEntry.toString() (the hereby targeted method-under-test)
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
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getPrivateKey() public java.security.PrivateKey
         * java.security.KeyStore$PrivateKeyEntry.getPrivateKey()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getPrivateKey() public java.security.PrivateKey
         * java.security.KeyStore$PrivateKeyEntry.getPrivateKey()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PrivateKeyEntry#getPrivateKey() public java.security.PrivateKey
         *      java.security.KeyStore$PrivateKeyEntry.getPrivateKey() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getPrivateKey()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getAttributes() public java.util.Set
         * <java.security.KeyStore$Entry$Attribute> java.security.KeyStore$PrivateKeyEntry.getAttributes()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getAttributes() public java.util.Set
         * java.security.KeyStore$PrivateKeyEntry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PrivateKeyEntry#getAttributes() public java.util.Set
         *      java.security.KeyStore$PrivateKeyEntry.getAttributes() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getAttributes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getCertificateChain() public
         * java.security.cert.Certificate[] java.security.KeyStore$PrivateKeyEntry.getCertificateChain()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getCertificateChain() public
         * java.security.cert.Certificate[] java.security.KeyStore$PrivateKeyEntry.getCertificateChain()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PrivateKeyEntry#getCertificateChain() public java.security.cert.Certificate[]
         *      java.security.KeyStore$PrivateKeyEntry.getCertificateChain() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getCertificateChain()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getCertificate() public
         * java.security.cert.Certificate java.security.KeyStore$PrivateKeyEntry.getCertificate()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getCertificate() public
         * java.security.cert.Certificate java.security.KeyStore$PrivateKeyEntry.getCertificate()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PrivateKeyEntry#getCertificate() public java.security.cert.Certificate
         *      java.security.KeyStore$PrivateKeyEntry.getCertificate() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getCertificate()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.LoadStoreParameter interface
     * java.security.KeyStore$LoadStoreParameter}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link KeyStoreClassTests.LoadStoreParameterClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.LoadStoreParameter interface java.security.KeyStore$LoadStoreParameter (the hereby
     *      targeted class-under-test class)
     * @see KeyStoreClassTests.LoadStoreParameterClassTests KeyStoreClassTests.LoadStoreParameterClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LoadStoreParameterTests<SUT extends java.security.KeyStore.LoadStoreParameter>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.LoadStoreParameter#getProtectionParameter() public abstract
         * java.security.KeyStore$ProtectionParameter
         * java.security.KeyStore$LoadStoreParameter.getProtectionParameter()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.LoadStoreParameter#getProtectionParameter() public abstract
         * java.security.KeyStore$ProtectionParameter
         * java.security.KeyStore$LoadStoreParameter.getProtectionParameter()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.LoadStoreParameter#getProtectionParameter() public abstract
         *      java.security.KeyStore$ProtectionParameter
         *      java.security.KeyStore$LoadStoreParameter.getProtectionParameter() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getProtectionParameter()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.CallbackHandlerProtection class
     * java.security.KeyStore$CallbackHandlerProtection}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link KeyStoreClassTests.CallbackHandlerProtectionClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.CallbackHandlerProtection class java.security.KeyStore$CallbackHandlerProtection (the
     *      hereby targeted class-under-test class)
     * @see KeyStoreClassTests.CallbackHandlerProtectionClassTests
     *      KeyStoreClassTests.CallbackHandlerProtectionClassTests (the complementary j8unit test interface containing
     *      the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CallbackHandlerProtectionTests<SUT extends java.security.KeyStore.CallbackHandlerProtection>
    extends KeyStoreTests.ProtectionParameterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.CallbackHandlerProtection#getCallbackHandler() public
         * javax.security.auth.callback.CallbackHandler
         * java.security.KeyStore$CallbackHandlerProtection.getCallbackHandler()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.CallbackHandlerProtection#getCallbackHandler() public
         * javax.security.auth.callback.CallbackHandler
         * java.security.KeyStore$CallbackHandlerProtection.getCallbackHandler()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.CallbackHandlerProtection#getCallbackHandler() public
         *      javax.security.auth.callback.CallbackHandler
         *      java.security.KeyStore$CallbackHandlerProtection.getCallbackHandler() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getCallbackHandler()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.PasswordProtection class
     * java.security.KeyStore$PasswordProtection}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link KeyStoreClassTests.PasswordProtectionClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.PasswordProtection class java.security.KeyStore$PasswordProtection (the hereby
     *      targeted class-under-test class)
     * @see KeyStoreClassTests.PasswordProtectionClassTests KeyStoreClassTests.PasswordProtectionClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PasswordProtectionTests<SUT extends java.security.KeyStore.PasswordProtection>
    extends KeyStoreTests.ProtectionParameterTests<SUT>, org.j8unit.repository.javax.security.auth.DestroyableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#isDestroyed() public synchronized boolean
         * java.security.KeyStore$PasswordProtection.isDestroyed()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#isDestroyed() public synchronized boolean
         * java.security.KeyStore$PasswordProtection.isDestroyed()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PasswordProtection#isDestroyed() public synchronized boolean
         *      java.security.KeyStore$PasswordProtection.isDestroyed() (the hereby targeted method-under-test)
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
         * Test method for {@link java.security.KeyStore.PasswordProtection#getPassword() public synchronized char[]
         * java.security.KeyStore$PasswordProtection.getPassword()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#getPassword() public synchronized char[]
         * java.security.KeyStore$PasswordProtection.getPassword()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PasswordProtection#getPassword() public synchronized char[]
         *      java.security.KeyStore$PasswordProtection.getPassword() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getPassword()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#getProtectionParameters() public
         * java.security.spec.AlgorithmParameterSpec
         * java.security.KeyStore$PasswordProtection.getProtectionParameters()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#getProtectionParameters() public
         * java.security.spec.AlgorithmParameterSpec
         * java.security.KeyStore$PasswordProtection.getProtectionParameters()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PasswordProtection#getProtectionParameters() public
         *      java.security.spec.AlgorithmParameterSpec
         *      java.security.KeyStore$PasswordProtection.getProtectionParameters() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getProtectionParameters()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#getProtectionAlgorithm() public
         * java.lang.String java.security.KeyStore$PasswordProtection.getProtectionAlgorithm()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#getProtectionAlgorithm() public
         * java.lang.String java.security.KeyStore$PasswordProtection.getProtectionAlgorithm()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PasswordProtection#getProtectionAlgorithm() public java.lang.String
         *      java.security.KeyStore$PasswordProtection.getProtectionAlgorithm() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getProtectionAlgorithm()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#destroy() public synchronized void
         * java.security.KeyStore$PasswordProtection.destroy() throws javax.security.auth.DestroyFailedException}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#destroy() public synchronized void
         * java.security.KeyStore$PasswordProtection.destroy() throws javax.security.auth.DestroyFailedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.PasswordProtection#destroy() public synchronized void
         *      java.security.KeyStore$PasswordProtection.destroy() throws javax.security.auth.DestroyFailedException
         *      (the hereby targeted method-under-test)
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

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.TrustedCertificateEntry class
     * java.security.KeyStore$TrustedCertificateEntry}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link KeyStoreClassTests.TrustedCertificateEntryClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.TrustedCertificateEntry class java.security.KeyStore$TrustedCertificateEntry (the
     *      hereby targeted class-under-test class)
     * @see KeyStoreClassTests.TrustedCertificateEntryClassTests KeyStoreClassTests.TrustedCertificateEntryClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TrustedCertificateEntryTests<SUT extends java.security.KeyStore.TrustedCertificateEntry>
    extends KeyStoreTests.EntryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.TrustedCertificateEntry#getAttributes() public java.util.Set
         * <java.security.KeyStore$Entry$Attribute> java.security.KeyStore$TrustedCertificateEntry.getAttributes()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.TrustedCertificateEntry#getAttributes() public java.util.Set
         * java.security.KeyStore$TrustedCertificateEntry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.TrustedCertificateEntry#getAttributes() public java.util.Set
         *      java.security.KeyStore$TrustedCertificateEntry.getAttributes() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getAttributes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.TrustedCertificateEntry#getTrustedCertificate() public
         * java.security.cert.Certificate java.security.KeyStore$TrustedCertificateEntry.getTrustedCertificate()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.TrustedCertificateEntry#getTrustedCertificate() public
         * java.security.cert.Certificate java.security.KeyStore$TrustedCertificateEntry.getTrustedCertificate()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.TrustedCertificateEntry#getTrustedCertificate() public
         *      java.security.cert.Certificate java.security.KeyStore$TrustedCertificateEntry.getTrustedCertificate()
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getTrustedCertificate()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.TrustedCertificateEntry#toString() public java.lang.String
         * java.security.KeyStore$TrustedCertificateEntry.toString()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.TrustedCertificateEntry#toString() public java.lang.String
         * java.security.KeyStore$TrustedCertificateEntry.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.TrustedCertificateEntry#toString() public java.lang.String
         *      java.security.KeyStore$TrustedCertificateEntry.toString() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.Builder class java.security.KeyStore$Builder}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link KeyStoreClassTests.BuilderClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.Builder class java.security.KeyStore$Builder (the hereby targeted class-under-test
     *      class)
     * @see KeyStoreClassTests.BuilderClassTests KeyStoreClassTests.BuilderClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderTests<SUT extends java.security.KeyStore.Builder>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.Builder#getProtectionParameter(String) public abstract
         * java.security.KeyStore$ProtectionParameter
         * java.security.KeyStore$Builder.getProtectionParameter(java.lang.String) throws
         * java.security.KeyStoreException}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.Builder#getProtectionParameter(String) public abstract
         * java.security.KeyStore$ProtectionParameter
         * java.security.KeyStore$Builder.getProtectionParameter(java.lang.String) throws
         * java.security.KeyStoreException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.Builder#getProtectionParameter(String) public abstract
         *      java.security.KeyStore$ProtectionParameter
         *      java.security.KeyStore$Builder.getProtectionParameter(java.lang.String) throws
         *      java.security.KeyStoreException (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getProtectionParameter_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.Builder#getKeyStore() public abstract java.security.KeyStore
         * java.security.KeyStore$Builder.getKeyStore() throws java.security.KeyStoreException}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.Builder#getKeyStore() public abstract java.security.KeyStore
         * java.security.KeyStore$Builder.getKeyStore() throws java.security.KeyStoreException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.Builder#getKeyStore() public abstract java.security.KeyStore
         *      java.security.KeyStore$Builder.getKeyStore() throws java.security.KeyStoreException (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getKeyStore()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.SecretKeyEntry class
     * java.security.KeyStore$SecretKeyEntry}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link KeyStoreClassTests.SecretKeyEntryClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.SecretKeyEntry class java.security.KeyStore$SecretKeyEntry (the hereby targeted
     *      class-under-test class)
     * @see KeyStoreClassTests.SecretKeyEntryClassTests KeyStoreClassTests.SecretKeyEntryClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SecretKeyEntryTests<SUT extends java.security.KeyStore.SecretKeyEntry>
    extends KeyStoreTests.EntryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#toString() public java.lang.String
         * java.security.KeyStore$SecretKeyEntry.toString()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#toString() public java.lang.String
         * java.security.KeyStore$SecretKeyEntry.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.SecretKeyEntry#toString() public java.lang.String
         *      java.security.KeyStore$SecretKeyEntry.toString() (the hereby targeted method-under-test)
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
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#getAttributes() public java.util.Set
         * <java.security.KeyStore$Entry$Attribute> java.security.KeyStore$SecretKeyEntry.getAttributes()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#getAttributes() public java.util.Set
         * java.security.KeyStore$SecretKeyEntry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.SecretKeyEntry#getAttributes() public java.util.Set
         *      java.security.KeyStore$SecretKeyEntry.getAttributes() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getAttributes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#getSecretKey() public javax.crypto.SecretKey
         * java.security.KeyStore$SecretKeyEntry.getSecretKey()}.
         *
         * <p>
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#getSecretKey() public javax.crypto.SecretKey
         * java.security.KeyStore$SecretKeyEntry.getSecretKey()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.security.KeyStore.SecretKeyEntry#getSecretKey() public javax.crypto.SecretKey
         *      java.security.KeyStore$SecretKeyEntry.getSecretKey() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getSecretKey()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.KeyStore.ProtectionParameter interface
     * java.security.KeyStore$ProtectionParameter}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link KeyStoreClassTests.ProtectionParameterClassTests}.
     * </p>
     *
     * @see java.security.KeyStore.ProtectionParameter interface java.security.KeyStore$ProtectionParameter (the hereby
     *      targeted class-under-test class)
     * @see KeyStoreClassTests.ProtectionParameterClassTests KeyStoreClassTests.ProtectionParameterClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ProtectionParameterTests<SUT extends java.security.KeyStore.ProtectionParameter>
    extends RepositoryTests<SUT> {

    }

}
