package org.j8unit.repository.java.security;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.KeyStore class java.security.KeyStore}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.KeyStoreTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.KeyStoreClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.KeyStore
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyStoreTests<SUT extends java.security.KeyStore>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.Builder class
     * java.security.KeyStore$Builder}, containing all instance relevant test methods (i.&thinsp;e., test methods of
     * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.BuilderTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.BuilderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.Builder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderTests<SUT extends java.security.KeyStore.Builder>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.Builder#getKeyStore() public abstract java.security.KeyStore
         * java.security.KeyStore$Builder.getKeyStore() throws java.security.KeyStoreException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.Builder#getKeyStore()
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

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.Builder#getProtectionParameter(java.lang.String) public
         * abstract java.security.KeyStore$ProtectionParameter
         * java.security.KeyStore$Builder.getProtectionParameter(java.lang.String) throws
         * java.security.KeyStoreException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.Builder#getProtectionParameter(java.lang.String)
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

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.CallbackHandlerProtection class
     * java.security.KeyStore$CallbackHandlerProtection}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.java.security.KeyStoreTests.CallbackHandlerProtectionTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.CallbackHandlerProtectionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.CallbackHandlerProtection
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CallbackHandlerProtectionTests<SUT extends java.security.KeyStore.CallbackHandlerProtection>
    extends org.j8unit.repository.java.security.KeyStoreTests.ProtectionParameterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
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
         * @j8unit.aim java.security.KeyStore.CallbackHandlerProtection#getCallbackHandler()
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
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.Entry interface
     * java.security.KeyStore$Entry}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
     * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.EntryTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.Entry
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EntryTests<SUT extends java.security.KeyStore.Entry>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.Entry.Attribute interface
         * java.security.KeyStore$Entry$Attribute}, containing all instance relevant test methods (i.&thinsp;e., test
         * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
         * test methods is {@link org.j8unit.repository.java.security.KeyStoreTests.EntryTests.AttributeTests}.
         * </p>
         *
         * @see org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests.AttributeClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim java.security.KeyStore.Entry.Attribute
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface AttributeTests<SUT extends java.security.KeyStore.Entry.Attribute>
        extends RepositoryTests<SUT> {

            /**
             * <p>
             * Test method for {@link java.security.KeyStore.Entry.Attribute#getName() public abstract java.lang.String
             * java.security.KeyStore$Entry$Attribute.getName()}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim java.security.KeyStore.Entry.Attribute#getName()
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

            /**
             * <p>
             * Test method for {@link java.security.KeyStore.Entry.Attribute#getValue() public abstract java.lang.String
             * java.security.KeyStore$Entry$Attribute.getValue()}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim java.security.KeyStore.Entry.Attribute#getValue()
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

        }

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.Entry#getAttributes() public default java.util.Set
         * java.security.KeyStore$Entry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.Entry#getAttributes()
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

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.LoadStoreParameter interface
     * java.security.KeyStore$LoadStoreParameter}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.java.security.KeyStoreTests.LoadStoreParameterTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.LoadStoreParameterClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.LoadStoreParameter
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.LoadStoreParameter#getProtectionParameter()
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
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.PasswordProtection class
     * java.security.KeyStore$PasswordProtection}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.java.security.KeyStoreTests.PasswordProtectionTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.PasswordProtectionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.PasswordProtection
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PasswordProtectionTests<SUT extends java.security.KeyStore.PasswordProtection>
    extends org.j8unit.repository.java.security.KeyStoreTests.ProtectionParameterTests<SUT>, org.j8unit.repository.javax.security.auth.DestroyableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PasswordProtection#destroy() public synchronized void
         * java.security.KeyStore$PasswordProtection.destroy() throws javax.security.auth.DestroyFailedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PasswordProtection#destroy()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_destroy()
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PasswordProtection#getPassword()
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
         * Test method for {@link java.security.KeyStore.PasswordProtection#getProtectionAlgorithm() public
         * java.lang.String java.security.KeyStore$PasswordProtection.getProtectionAlgorithm()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PasswordProtection#getProtectionAlgorithm()
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
         * Test method for {@link java.security.KeyStore.PasswordProtection#getProtectionParameters() public
         * java.security.spec.AlgorithmParameterSpec
         * java.security.KeyStore$PasswordProtection.getProtectionParameters()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PasswordProtection#getProtectionParameters()
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
         * Test method for {@link java.security.KeyStore.PasswordProtection#isDestroyed() public synchronized boolean
         * java.security.KeyStore$PasswordProtection.isDestroyed()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PasswordProtection#isDestroyed()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_isDestroyed()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.PrivateKeyEntry class
     * java.security.KeyStore$PrivateKeyEntry}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.java.security.KeyStoreTests.PrivateKeyEntryTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.PrivateKeyEntryClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.PrivateKeyEntry
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PrivateKeyEntryTests<SUT extends java.security.KeyStore.PrivateKeyEntry>
    extends org.j8unit.repository.java.security.KeyStoreTests.EntryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getAttributes() public java.util.Set
         * java.security.KeyStore$PrivateKeyEntry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PrivateKeyEntry#getAttributes()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getAttributes()
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PrivateKeyEntry#getCertificate()
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

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getCertificateChain() public
         * java.security.cert.Certificate[] java.security.KeyStore$PrivateKeyEntry.getCertificateChain()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PrivateKeyEntry#getCertificateChain()
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
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#getPrivateKey() public java.security.PrivateKey
         * java.security.KeyStore$PrivateKeyEntry.getPrivateKey()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PrivateKeyEntry#getPrivateKey()
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
         * Test method for {@link java.security.KeyStore.PrivateKeyEntry#toString() public java.lang.String
         * java.security.KeyStore$PrivateKeyEntry.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.PrivateKeyEntry#toString()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.ProtectionParameter interface
     * java.security.KeyStore$ProtectionParameter}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.java.security.KeyStoreTests.ProtectionParameterTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.ProtectionParameterClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.ProtectionParameter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ProtectionParameterTests<SUT extends java.security.KeyStore.ProtectionParameter>
    extends RepositoryTests<SUT> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.SecretKeyEntry class
     * java.security.KeyStore$SecretKeyEntry}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.java.security.KeyStoreTests.SecretKeyEntryTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.SecretKeyEntryClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.SecretKeyEntry
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SecretKeyEntryTests<SUT extends java.security.KeyStore.SecretKeyEntry>
    extends org.j8unit.repository.java.security.KeyStoreTests.EntryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#getAttributes() public java.util.Set
         * java.security.KeyStore$SecretKeyEntry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.SecretKeyEntry#getAttributes()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.SecretKeyEntry#getSecretKey()
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

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#toString() public java.lang.String
         * java.security.KeyStore$SecretKeyEntry.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.SecretKeyEntry#toString()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.KeyStore.TrustedCertificateEntry class
     * java.security.KeyStore$TrustedCertificateEntry}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.java.security.KeyStoreTests.TrustedCertificateEntryTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.KeyStoreClassTests.TrustedCertificateEntryClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.KeyStore.TrustedCertificateEntry
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TrustedCertificateEntryTests<SUT extends java.security.KeyStore.TrustedCertificateEntry>
    extends org.j8unit.repository.java.security.KeyStoreTests.EntryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.security.KeyStore.TrustedCertificateEntry#getAttributes() public java.util.Set
         * java.security.KeyStore$TrustedCertificateEntry.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.TrustedCertificateEntry#getAttributes()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.TrustedCertificateEntry#getTrustedCertificate()
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.security.KeyStore.TrustedCertificateEntry#toString()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#aliases() public final java.util.Enumeration
     * java.security.KeyStore.aliases() throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#aliases()
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
     * Test method for {@link java.security.KeyStore#containsAlias(java.lang.String) public final boolean
     * java.security.KeyStore.containsAlias(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#containsAlias(java.lang.String)
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
     * Test method for {@link java.security.KeyStore#deleteEntry(java.lang.String) public final void
     * java.security.KeyStore.deleteEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#deleteEntry(java.lang.String)
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
     * Test method for {@link java.security.KeyStore#entryInstanceOf(java.lang.String, java.lang.Class) public final
     * boolean java.security.KeyStore.entryInstanceOf(java.lang.String,java.lang.Class) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#entryInstanceOf(java.lang.String, java.lang.Class)
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
     * Test method for {@link java.security.KeyStore#getCertificate(java.lang.String) public final
     * java.security.cert.Certificate java.security.KeyStore.getCertificate(java.lang.String) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getCertificate(java.lang.String)
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
     * Test method for {@link java.security.KeyStore#getCertificateAlias(java.security.cert.Certificate) public final
     * java.lang.String java.security.KeyStore.getCertificateAlias(java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getCertificateAlias(java.security.cert.Certificate)
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
     * Test method for {@link java.security.KeyStore#getCertificateChain(java.lang.String) public final
     * java.security.cert.Certificate[] java.security.KeyStore.getCertificateChain(java.lang.String) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getCertificateChain(java.lang.String)
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
     * Test method for {@link java.security.KeyStore#getCreationDate(java.lang.String) public final java.util.Date
     * java.security.KeyStore.getCreationDate(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getCreationDate(java.lang.String)
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
     * Test method for
     * {@link java.security.KeyStore#getEntry(java.lang.String, java.security.KeyStore.ProtectionParameter) public final
     * java.security.KeyStore$Entry
     * java.security.KeyStore.getEntry(java.lang.String,java.security.KeyStore$ProtectionParameter) throws
     * java.security.NoSuchAlgorithmException,java.security.UnrecoverableEntryException,java.security.KeyStoreException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getEntry(java.lang.String, java.security.KeyStore.ProtectionParameter)
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
     * Test method for {@link java.security.KeyStore#getKey(java.lang.String, char[]) public final java.security.Key
     * java.security.KeyStore.getKey(java.lang.String,char[]) throws
     * java.security.KeyStoreException,java.security.NoSuchAlgorithmException,java.security.UnrecoverableKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getKey(java.lang.String, char[])
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
     * Test method for {@link java.security.KeyStore#getProvider() public final java.security.Provider
     * java.security.KeyStore.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getProvider()
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
     * Test method for {@link java.security.KeyStore#getType() public final java.lang.String
     * java.security.KeyStore.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#getType()
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
     * Test method for {@link java.security.KeyStore#isCertificateEntry(java.lang.String) public final boolean
     * java.security.KeyStore.isCertificateEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#isCertificateEntry(java.lang.String)
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
     * Test method for {@link java.security.KeyStore#isKeyEntry(java.lang.String) public final boolean
     * java.security.KeyStore.isKeyEntry(java.lang.String) throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#isKeyEntry(java.lang.String)
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
     * Test method for {@link java.security.KeyStore#load(java.io.InputStream, char[]) public final void
     * java.security.KeyStore.load(java.io.InputStream,char[]) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#load(java.io.InputStream, char[])
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
     * Test method for {@link java.security.KeyStore#load(java.security.KeyStore.LoadStoreParameter) public final void
     * java.security.KeyStore.load(java.security.KeyStore$LoadStoreParameter) throws
     * java.io.IOException,java.security.NoSuchAlgorithmException,java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#load(java.security.KeyStore.LoadStoreParameter)
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
     * Test method for
     * {@link java.security.KeyStore#setCertificateEntry(java.lang.String, java.security.cert.Certificate) public final
     * void java.security.KeyStore.setCertificateEntry(java.lang.String,java.security.cert.Certificate) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#setCertificateEntry(java.lang.String, java.security.cert.Certificate)
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
     * Test method for
     * {@link java.security.KeyStore#setEntry(java.lang.String, java.security.KeyStore.Entry, java.security.KeyStore.ProtectionParameter)
     * public final void
     * java.security.KeyStore.setEntry(java.lang.String,java.security.KeyStore$Entry,java.security.KeyStore$ProtectionParameter)
     * throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#setEntry(java.lang.String, java.security.KeyStore.Entry,
     *             java.security.KeyStore.ProtectionParameter)
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
     * Test method for
     * {@link java.security.KeyStore#setKeyEntry(java.lang.String, byte[], java.security.cert.Certificate[]) public
     * final void java.security.KeyStore.setKeyEntry(java.lang.String,byte[],java.security.cert.Certificate[]) throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#setKeyEntry(java.lang.String, byte[], java.security.cert.Certificate[])
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
     * Test method for
     * {@link java.security.KeyStore#setKeyEntry(java.lang.String, java.security.Key, char[], java.security.cert.Certificate[])
     * public final void
     * java.security.KeyStore.setKeyEntry(java.lang.String,java.security.Key,char[],java.security.cert.Certificate[])
     * throws java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#setKeyEntry(java.lang.String, java.security.Key, char[],
     *             java.security.cert.Certificate[])
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
     * Test method for {@link java.security.KeyStore#size() public final int java.security.KeyStore.size() throws
     * java.security.KeyStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#size()
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
     * @j8unit.aim java.security.KeyStore#store(java.security.KeyStore.LoadStoreParameter)
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.KeyStore#store(java.io.OutputStream, char[])
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

}
