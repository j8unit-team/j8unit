package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.KeyStoreSpi class java.security.KeyStoreSpi}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeyStoreSpiClassTests}.
 * </p>
 *
 * @see java.security.KeyStoreSpi class java.security.KeyStoreSpi (the hereby targeted class-under-test class)
 * @see KeyStoreSpiClassTests KeyStoreSpiClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyStoreSpiTests<SUT extends java.security.KeyStoreSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetKeyEntry(String, java.security.Key, char[], java.security.cert.Certificate[])
     * public abstract void
     * java.security.KeyStoreSpi.engineSetKeyEntry(java.lang.String,java.security.Key,char[],java.security.cert.Certificate[])
     * throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetKeyEntry(String, java.security.Key, char[], java.security.cert.Certificate[])
     * public abstract void
     * java.security.KeyStoreSpi.engineSetKeyEntry(java.lang.String,java.security.Key,char[],java.security.cert.Certificate[])
     * throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineSetKeyEntry(String, java.security.Key, char[],
     *      java.security.cert.Certificate[]) public abstract void
     *      java.security.KeyStoreSpi.engineSetKeyEntry(java.lang.String,java.security.Key,char[],java.security.cert.
     *      Certificate[]) throws java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineSetKeyEntry_String_Key_charArray_CertificateArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetKeyEntry(String, byte[], java.security.cert.Certificate[]) public
     * abstract void
     * java.security.KeyStoreSpi.engineSetKeyEntry(java.lang.String,byte[],java.security.cert.Certificate[]) throws
     * java.security.KeyStoreException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetKeyEntry(String, byte[], java.security.cert.Certificate[]) public
     * abstract void
     * java.security.KeyStoreSpi.engineSetKeyEntry(java.lang.String,byte[],java.security.cert.Certificate[]) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineSetKeyEntry(String, byte[], java.security.cert.Certificate[]) public
     *      abstract void
     *      java.security.KeyStoreSpi.engineSetKeyEntry(java.lang.String,byte[],java.security.cert.Certificate[]) throws
     *      java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineSetKeyEntry_String_byteArray_CertificateArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCertificate(String) public abstract
     * java.security.cert.Certificate java.security.KeyStoreSpi.engineGetCertificate(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCertificate(String) public abstract
     * java.security.cert.Certificate java.security.KeyStoreSpi.engineGetCertificate(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineGetCertificate(String) public abstract java.security.cert.Certificate
     *      java.security.KeyStoreSpi.engineGetCertificate(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetCertificate_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCertificateChain(String) public abstract
     * java.security.cert.Certificate[] java.security.KeyStoreSpi.engineGetCertificateChain(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCertificateChain(String) public abstract
     * java.security.cert.Certificate[] java.security.KeyStoreSpi.engineGetCertificateChain(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineGetCertificateChain(String) public abstract java.security.cert.Certificate[]
     *      java.security.KeyStoreSpi.engineGetCertificateChain(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetCertificateChain_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineIsKeyEntry(String) public abstract boolean
     * java.security.KeyStoreSpi.engineIsKeyEntry(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineIsKeyEntry(String) public abstract boolean
     * java.security.KeyStoreSpi.engineIsKeyEntry(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineIsKeyEntry(String) public abstract boolean
     *      java.security.KeyStoreSpi.engineIsKeyEntry(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineIsKeyEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineDeleteEntry(String) public abstract void
     * java.security.KeyStoreSpi.engineDeleteEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineDeleteEntry(String) public abstract void
     * java.security.KeyStoreSpi.engineDeleteEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineDeleteEntry(String) public abstract void
     *      java.security.KeyStoreSpi.engineDeleteEntry(java.lang.String) throws java.security.KeyStoreException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineDeleteEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetCertificateEntry(String, java.security.cert.Certificate) public
     * abstract void
     * java.security.KeyStoreSpi.engineSetCertificateEntry(java.lang.String,java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetCertificateEntry(String, java.security.cert.Certificate) public
     * abstract void
     * java.security.KeyStoreSpi.engineSetCertificateEntry(java.lang.String,java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineSetCertificateEntry(String, java.security.cert.Certificate) public abstract
     *      void java.security.KeyStoreSpi.engineSetCertificateEntry(java.lang.String,java.security.cert.Certificate)
     *      throws java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineSetCertificateEntry_String_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineGetEntry(String, java.security.KeyStore.ProtectionParameter) public
     * java.security.KeyStore$Entry
     * java.security.KeyStoreSpi.engineGetEntry(java.lang.String,java.security.KeyStore$ProtectionParameter) throws
     * java.security.KeyStoreException,java.security.NoSuchAlgorithmException,java.security.UnrecoverableEntryException}
     * .
     *
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineGetEntry(String, java.security.KeyStore.ProtectionParameter) public
     * java.security.KeyStore$Entry
     * java.security.KeyStoreSpi.engineGetEntry(java.lang.String,java.security.KeyStore$ProtectionParameter) throws
     * java.security.KeyStoreException,java.security.NoSuchAlgorithmException,java.security.UnrecoverableEntryException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineGetEntry(String, java.security.KeyStore.ProtectionParameter) public
     *      java.security.KeyStore$Entry
     *      java.security.KeyStoreSpi.engineGetEntry(java.lang.String,java.security.KeyStore$ProtectionParameter) throws
     *      java.security.KeyStoreException,java.security.NoSuchAlgorithmException,java.security.
     *      UnrecoverableEntryException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetEntry_String_ProtectionParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineStore(java.io.OutputStream, char[]) public abstract void
     * java.security.KeyStoreSpi.engineStore(java.io.OutputStream,char[]) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineStore(java.io.OutputStream, char[]) public abstract void
     * java.security.KeyStoreSpi.engineStore(java.io.OutputStream,char[]) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineStore(java.io.OutputStream, char[]) public abstract void
     *      java.security.KeyStoreSpi.engineStore(java.io.OutputStream,char[]) throws
     *      java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineStore_OutputStream_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineStore(java.security.KeyStore.LoadStoreParameter) public
     * void java.security.KeyStoreSpi.engineStore(java.security.KeyStore$LoadStoreParameter) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineStore(java.security.KeyStore.LoadStoreParameter) public
     * void java.security.KeyStoreSpi.engineStore(java.security.KeyStore$LoadStoreParameter) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineStore(java.security.KeyStore.LoadStoreParameter) public void
     *      java.security.KeyStoreSpi.engineStore(java.security.KeyStore$LoadStoreParameter) throws
     *      java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineStore_LoadStoreParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineAliases() public abstract java.util.Enumeration
     * <java.lang.String> java.security.KeyStoreSpi.engineAliases()}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineAliases() public abstract java.util.Enumeration
     * java.security.KeyStoreSpi.engineAliases()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineAliases() public abstract java.util.Enumeration
     *      java.security.KeyStoreSpi.engineAliases() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineAliases()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineContainsAlias(String) public abstract boolean
     * java.security.KeyStoreSpi.engineContainsAlias(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineContainsAlias(String) public abstract boolean
     * java.security.KeyStoreSpi.engineContainsAlias(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineContainsAlias(String) public abstract boolean
     *      java.security.KeyStoreSpi.engineContainsAlias(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineContainsAlias_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineLoad(java.security.KeyStore.LoadStoreParameter) public
     * void java.security.KeyStoreSpi.engineLoad(java.security.KeyStore$LoadStoreParameter) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineLoad(java.security.KeyStore.LoadStoreParameter) public
     * void java.security.KeyStoreSpi.engineLoad(java.security.KeyStore$LoadStoreParameter) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineLoad(java.security.KeyStore.LoadStoreParameter) public void
     *      java.security.KeyStoreSpi.engineLoad(java.security.KeyStore$LoadStoreParameter) throws
     *      java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineLoad_LoadStoreParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineLoad(java.io.InputStream, char[]) public abstract void
     * java.security.KeyStoreSpi.engineLoad(java.io.InputStream,char[]) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineLoad(java.io.InputStream, char[]) public abstract void
     * java.security.KeyStoreSpi.engineLoad(java.io.InputStream,char[]) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineLoad(java.io.InputStream, char[]) public abstract void
     *      java.security.KeyStoreSpi.engineLoad(java.io.InputStream,char[]) throws
     *      java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineLoad_InputStream_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetEntry(String, java.security.KeyStore.Entry, java.security.KeyStore.ProtectionParameter)
     * public void
     * java.security.KeyStoreSpi.engineSetEntry(java.lang.String,java.security.KeyStore$Entry,java.security.KeyStore$ProtectionParameter)
     * throws java.security.KeyStoreException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyStoreSpi#engineSetEntry(String, java.security.KeyStore.Entry, java.security.KeyStore.ProtectionParameter)
     * public void
     * java.security.KeyStoreSpi.engineSetEntry(java.lang.String,java.security.KeyStore$Entry,java.security.KeyStore$ProtectionParameter)
     * throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineSetEntry(String, java.security.KeyStore.Entry,
     *      java.security.KeyStore.ProtectionParameter) public void
     *      java.security.KeyStoreSpi.engineSetEntry(java.lang.String,java.security.KeyStore$Entry,java.security.
     *      KeyStore$ProtectionParameter) throws java.security.KeyStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineSetEntry_String_Entry_ProtectionParameter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCreationDate(String) public abstract java.util.Date
     * java.security.KeyStoreSpi.engineGetCreationDate(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCreationDate(String) public abstract java.util.Date
     * java.security.KeyStoreSpi.engineGetCreationDate(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineGetCreationDate(String) public abstract java.util.Date
     *      java.security.KeyStoreSpi.engineGetCreationDate(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetCreationDate_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetKey(String, char[]) public abstract java.security.Key
     * java.security.KeyStoreSpi.engineGetKey(java.lang.String,char[]) throws
     * java.security.NoSuchAlgorithmException,java.security.UnrecoverableKeyException}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetKey(String, char[]) public abstract java.security.Key
     * java.security.KeyStoreSpi.engineGetKey(java.lang.String,char[]) throws
     * java.security.NoSuchAlgorithmException,java.security.UnrecoverableKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineGetKey(String, char[]) public abstract java.security.Key
     *      java.security.KeyStoreSpi.engineGetKey(java.lang.String,char[]) throws
     *      java.security.NoSuchAlgorithmException,java.security.UnrecoverableKeyException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetKey_String_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineSize() public abstract int
     * java.security.KeyStoreSpi.engineSize()}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineSize() public abstract int
     * java.security.KeyStoreSpi.engineSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineSize() public abstract int java.security.KeyStoreSpi.engineSize() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCertificateAlias(java.security.cert.Certificate) public
     * abstract java.lang.String java.security.KeyStoreSpi.engineGetCertificateAlias(java.security.cert.Certificate)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineGetCertificateAlias(java.security.cert.Certificate) public
     * abstract java.lang.String java.security.KeyStoreSpi.engineGetCertificateAlias(java.security.cert.Certificate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineGetCertificateAlias(java.security.cert.Certificate) public abstract
     *      java.lang.String java.security.KeyStoreSpi.engineGetCertificateAlias(java.security.cert.Certificate) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetCertificateAlias_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineEntryInstanceOf(String, Class) public boolean
     * java.security.KeyStoreSpi.engineEntryInstanceOf(java.lang.String,java.lang.Class<? extends
     * java.security.KeyStore$Entry>)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineEntryInstanceOf(String, Class) public boolean
     * java.security.KeyStoreSpi.engineEntryInstanceOf(java.lang.String,java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineEntryInstanceOf(String, Class) public boolean
     *      java.security.KeyStoreSpi.engineEntryInstanceOf(java.lang.String,java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineEntryInstanceOf_String_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineIsCertificateEntry(String) public abstract boolean
     * java.security.KeyStoreSpi.engineIsCertificateEntry(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.security.KeyStoreSpi#engineIsCertificateEntry(String) public abstract boolean
     * java.security.KeyStoreSpi.engineIsCertificateEntry(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyStoreSpi#engineIsCertificateEntry(String) public abstract boolean
     *      java.security.KeyStoreSpi.engineIsCertificateEntry(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineIsCertificateEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
