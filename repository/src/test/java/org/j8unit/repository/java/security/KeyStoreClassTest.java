package org.j8unit.repository.java.security;

import java.io.File;
import java.security.KeyStore;
import java.security.KeyStore.Builder;
import java.security.KeyStore.CallbackHandlerProtection;
import java.security.KeyStore.Entry;
import java.security.KeyStore.Entry.Attribute;
import java.security.KeyStore.LoadStoreParameter;
import java.security.KeyStore.PasswordProtection;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.KeyStore.ProtectionParameter;
import java.security.KeyStore.SecretKeyEntry;
import java.security.KeyStore.TrustedCertificateEntry;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.security.auth.callback.CallbackHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStoreClassTest
implements org.j8unit.repository.java.security.KeyStoreClassTests<KeyStore> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore]

    @Override
    public Class<KeyStore> createNewSUT() {
        return KeyStore.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link KeyStore#getInstance(String) public static
     * java.security.KeyStore java.security.KeyStore.getInstance(java.lang.String) throws
     * java.security.KeyStoreException}.
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
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link KeyStore#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link KeyStore#getInstance(String, String) public static
     * java.security.KeyStore java.security.KeyStore.getInstance(java.lang.String,java.lang.String) throws
     * java.security.KeyStoreException,java.security.NoSuchProviderException}.
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
    public void test_getInstance_String_String()
    throws Exception {
        // write some test for {@link KeyStore#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link KeyStore#getInstance(String, Provider) public static
     * java.security.KeyStore java.security.KeyStore.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.KeyStoreException}.
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
    public void test_getInstance_String_Provider()
    throws Exception {
        // write some test for {@link KeyStore#getInstance(String, Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link KeyStore#getDefaultType() public static final
     * java.lang.String java.security.KeyStore.getDefaultType()}.
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
    public void test_getDefaultType()
    throws Exception {
        // write some test for {@link KeyStore#getDefaultType()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore]

    @RunWith(J8Unit4.class)
    public static class LoadStoreParameterClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.LoadStoreParameterClassTests<LoadStoreParameter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$LoadStoreParameter]

        @Override
        public Class<LoadStoreParameter> createNewSUT() {
            return LoadStoreParameter.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$LoadStoreParameter]

    }

    @RunWith(J8Unit4.class)
    public static class SecretKeyEntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.SecretKeyEntryClassTests<SecretKeyEntry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$SecretKeyEntry]

        @Override
        public Class<SecretKeyEntry> createNewSUT() {
            return SecretKeyEntry.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link SecretKeyEntry#SecretKeyEntry(SecretKey)
         * public java.security.KeyStore$SecretKeyEntry(javax.crypto.SecretKey)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_SecretKeyEntry_SecretKey()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SecretKeyEntry sut = null; // = new SecretKeyEntry(SecretKey);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link SecretKeyEntry#SecretKeyEntry(SecretKey, Set) public
         * java.security.KeyStore$SecretKeyEntry(javax.crypto.SecretKey,java.util.Set
         * <java.security.KeyStore$Entry$Attribute>)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_SecretKeyEntry_SecretKey_Set()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SecretKeyEntry sut = null; // = new SecretKeyEntry(SecretKey, Set);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$SecretKeyEntry]

    }

    @RunWith(J8Unit4.class)
    public static class TrustedCertificateEntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.TrustedCertificateEntryClassTests<TrustedCertificateEntry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$TrustedCertificateEntry]

        @Override
        public Class<TrustedCertificateEntry> createNewSUT() {
            return TrustedCertificateEntry.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TrustedCertificateEntry#TrustedCertificateEntry(Certificate) public
         * java.security.KeyStore$TrustedCertificateEntry(java.security.cert.Certificate)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TrustedCertificateEntry_Certificate()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TrustedCertificateEntry sut = null; // = new TrustedCertificateEntry(Certificate);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TrustedCertificateEntry#TrustedCertificateEntry(Certificate, Set) public
         * java.security.KeyStore$TrustedCertificateEntry(java.security.cert.Certificate,java.util.Set
         * <java.security.KeyStore$Entry$Attribute>)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TrustedCertificateEntry_Certificate_Set()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TrustedCertificateEntry sut = null; // = new TrustedCertificateEntry(Certificate, Set);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$TrustedCertificateEntry]

    }

    @RunWith(J8Unit4.class)
    public static class ProtectionParameterClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.ProtectionParameterClassTests<ProtectionParameter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$ProtectionParameter]

        @Override
        public Class<ProtectionParameter> createNewSUT() {
            return ProtectionParameter.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$ProtectionParameter]

    }

    @RunWith(J8Unit4.class)
    public static class PasswordProtectionClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.PasswordProtectionClassTests<PasswordProtection> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$PasswordProtection]

        @Override
        public Class<PasswordProtection> createNewSUT() {
            return PasswordProtection.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link PasswordProtection#PasswordProtection(char[]) public
         * java.security.KeyStore$PasswordProtection(char[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_PasswordProtection_charArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PasswordProtection sut = null; // = new PasswordProtection(char[]);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link PasswordProtection#PasswordProtection(char[], String, AlgorithmParameterSpec) public
         * java.security.KeyStore$PasswordProtection(char[],java.lang.String,java.security.spec.AlgorithmParameterSpec)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_PasswordProtection_charArray_String_AlgorithmParameterSpec()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PasswordProtection sut = null; // = new PasswordProtection(char[], String, AlgorithmParameterSpec);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$PasswordProtection]

    }

    @RunWith(J8Unit4.class)
    public static class PrivateKeyEntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.PrivateKeyEntryClassTests<PrivateKeyEntry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$PrivateKeyEntry]

        @Override
        public Class<PrivateKeyEntry> createNewSUT() {
            return PrivateKeyEntry.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link PrivateKeyEntry#PrivateKeyEntry(PrivateKey, Certificate[]) public
         * java.security.KeyStore$PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_PrivateKeyEntry_PrivateKey_CertificateArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PrivateKeyEntry sut = null; // = new PrivateKeyEntry(PrivateKey, Certificate[]);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link PrivateKeyEntry#PrivateKeyEntry(PrivateKey, Certificate[], Set) public
         * java.security.KeyStore$PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[],java.util.Set
         * <java.security.KeyStore$Entry$Attribute>)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_PrivateKeyEntry_PrivateKey_CertificateArray_Set()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PrivateKeyEntry sut = null; // = new PrivateKeyEntry(PrivateKey, Certificate[], Set);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$PrivateKeyEntry]

    }

    @RunWith(J8Unit4.class)
    public static class CallbackHandlerProtectionClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.CallbackHandlerProtectionClassTests<CallbackHandlerProtection> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$CallbackHandlerProtection]

        @Override
        public Class<CallbackHandlerProtection> createNewSUT() {
            return CallbackHandlerProtection.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link CallbackHandlerProtection#CallbackHandlerProtection(CallbackHandler) public
         * java.security.KeyStore$CallbackHandlerProtection(javax.security.auth.callback.CallbackHandler)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_CallbackHandlerProtection_CallbackHandler()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final CallbackHandlerProtection sut = null; // = new CallbackHandlerProtection(CallbackHandler);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$CallbackHandlerProtection]

    }

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.BuilderClassTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$Builder]

        @Override
        public Class<Builder> createNewSUT() {
            return Builder.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link Builder#newInstance(KeyStore, ProtectionParameter) public static java.security.KeyStore$Builder
         * java.security.KeyStore$Builder.newInstance(java.security.KeyStore,java.security.KeyStore$ProtectionParameter)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_newInstance_KeyStore_ProtectionParameter()
        throws Exception {
            // write some test for {@link Builder#newInstance(KeyStore, ProtectionParameter)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link Builder#newInstance(String, Provider, File, ProtectionParameter) public static
         * java.security.KeyStore$Builder
         * java.security.KeyStore$Builder.newInstance(java.lang.String,java.security.Provider,java.io.File,java.security.KeyStore$ProtectionParameter)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_newInstance_String_Provider_File_ProtectionParameter()
        throws Exception {
            // write some test for {@link Builder#newInstance(String, Provider, File, ProtectionParameter)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link Builder#newInstance(String, Provider, ProtectionParameter) public static
         * java.security.KeyStore$Builder
         * java.security.KeyStore$Builder.newInstance(java.lang.String,java.security.Provider,java.security.KeyStore$ProtectionParameter)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_newInstance_String_Provider_ProtectionParameter()
        throws Exception {
            // write some test for {@link Builder#newInstance(String, Provider, ProtectionParameter)}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$Builder]

    }

    @RunWith(J8Unit4.class)
    public static class EntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests<Entry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$Entry]

        @Override
        public Class<Entry> createNewSUT() {
            return Entry.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$Entry]

        @RunWith(J8Unit4.class)
        public static class AttributeClassTest
        implements org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests.AttributeClassTests<Attribute> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStore$Entry$Attribute]

            @Override
            public Class<Attribute> createNewSUT() {
                return Attribute.class;
            }

            // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStore$Entry$Attribute]

        }

    }

}
