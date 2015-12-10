package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStoreTest
implements org.j8unit.repository.java.security.KeyStoreTests<java.security.KeyStore> {

    @RunWith(J8Unit4.class)
    public static class CallbackHandlerProtectionTest
    implements org.j8unit.repository.java.security.KeyStoreTests.CallbackHandlerProtectionTests<java.security.KeyStore.CallbackHandlerProtection> {

        @Override
        public java.security.KeyStore.CallbackHandlerProtection createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.security.KeyStore.CallbackHandlerProtection] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class PasswordProtectionTest
    implements org.j8unit.repository.java.security.KeyStoreTests.PasswordProtectionTests<java.security.KeyStore.PasswordProtection> {

        @Override
        public java.security.KeyStore.PasswordProtection createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.security.KeyStore.PasswordProtection] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class PrivateKeyEntryTest
    implements org.j8unit.repository.java.security.KeyStoreTests.PrivateKeyEntryTests<java.security.KeyStore.PrivateKeyEntry> {

        @Override
        public java.security.KeyStore.PrivateKeyEntry createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.security.KeyStore.PrivateKeyEntry] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class SecretKeyEntryTest
    implements org.j8unit.repository.java.security.KeyStoreTests.SecretKeyEntryTests<java.security.KeyStore.SecretKeyEntry> {

        @Override
        public java.security.KeyStore.SecretKeyEntry createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.security.KeyStore.SecretKeyEntry] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class TrustedCertificateEntryTest
    implements org.j8unit.repository.java.security.KeyStoreTests.TrustedCertificateEntryTests<java.security.KeyStore.TrustedCertificateEntry> {

        @Override
        public java.security.KeyStore.TrustedCertificateEntry createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.security.KeyStore.TrustedCertificateEntry] available.");
        }

    }

    @Override
    public java.security.KeyStore createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.KeyStore] available.");
    }

}
