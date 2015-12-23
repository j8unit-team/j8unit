package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStoreClassTest
implements org.j8unit.repository.java.security.KeyStoreClassTests<java.security.KeyStore> {

    @Override
    public Class<java.security.KeyStore> createNewSUT() {
        return java.security.KeyStore.class;
    }

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.BuilderClassTests<java.security.KeyStore.Builder> {

        @Override
        public Class<java.security.KeyStore.Builder> createNewSUT() {
            return java.security.KeyStore.Builder.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class PrivateKeyEntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.PrivateKeyEntryClassTests<java.security.KeyStore.PrivateKeyEntry> {

        @Override
        public Class<java.security.KeyStore.PrivateKeyEntry> createNewSUT() {
            return java.security.KeyStore.PrivateKeyEntry.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ProtectionParameterClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.ProtectionParameterClassTests<java.security.KeyStore.ProtectionParameter> {

        @Override
        public Class<java.security.KeyStore.ProtectionParameter> createNewSUT() {
            return java.security.KeyStore.ProtectionParameter.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class PasswordProtectionClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.PasswordProtectionClassTests<java.security.KeyStore.PasswordProtection> {

        @Override
        public Class<java.security.KeyStore.PasswordProtection> createNewSUT() {
            return java.security.KeyStore.PasswordProtection.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LoadStoreParameterClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.LoadStoreParameterClassTests<java.security.KeyStore.LoadStoreParameter> {

        @Override
        public Class<java.security.KeyStore.LoadStoreParameter> createNewSUT() {
            return java.security.KeyStore.LoadStoreParameter.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class SecretKeyEntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.SecretKeyEntryClassTests<java.security.KeyStore.SecretKeyEntry> {

        @Override
        public Class<java.security.KeyStore.SecretKeyEntry> createNewSUT() {
            return java.security.KeyStore.SecretKeyEntry.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class EntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests<java.security.KeyStore.Entry> {

        @Override
        public Class<java.security.KeyStore.Entry> createNewSUT() {
            return java.security.KeyStore.Entry.class;
        }

        @RunWith(J8Unit4.class)
        public static class AttributeClassTest
        implements org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests.AttributeClassTests<java.security.KeyStore.Entry.Attribute> {

            @Override
            public Class<java.security.KeyStore.Entry.Attribute> createNewSUT() {
                return java.security.KeyStore.Entry.Attribute.class;
            }

        }

    }

    @RunWith(J8Unit4.class)
    public static class CallbackHandlerProtectionClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.CallbackHandlerProtectionClassTests<java.security.KeyStore.CallbackHandlerProtection> {

        @Override
        public Class<java.security.KeyStore.CallbackHandlerProtection> createNewSUT() {
            return java.security.KeyStore.CallbackHandlerProtection.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class TrustedCertificateEntryClassTest
    implements org.j8unit.repository.java.security.KeyStoreClassTests.TrustedCertificateEntryClassTests<java.security.KeyStore.TrustedCertificateEntry> {

        @Override
        public Class<java.security.KeyStore.TrustedCertificateEntry> createNewSUT() {
            return java.security.KeyStore.TrustedCertificateEntry.class;
        }

    }

}
