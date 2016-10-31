package org.j8unit.repository.java.security;

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
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStoreTest
implements org.j8unit.repository.java.security.KeyStoreTests<KeyStore> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore]

    @Override
    public KeyStore createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyStore], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore]

    @RunWith(J8Unit4.class)
    public static class PrivateKeyEntryTest
    implements org.j8unit.repository.java.security.KeyStoreTests.PrivateKeyEntryTests<PrivateKeyEntry> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$PrivateKeyEntry]

        @Override
        public PrivateKeyEntry createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyStore.PrivateKeyEntry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$PrivateKeyEntry]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$PrivateKeyEntry]

    }

    @RunWith(J8Unit4.class)
    public static class SecretKeyEntryTest
    implements org.j8unit.repository.java.security.KeyStoreTests.SecretKeyEntryTests<SecretKeyEntry> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$SecretKeyEntry]

        @Override
        public SecretKeyEntry createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyStore.SecretKeyEntry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$SecretKeyEntry]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$SecretKeyEntry]

    }

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.security.KeyStoreTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyStore.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$Builder]

    }

    @RunWith(J8Unit4.class)
    public static class EntryTest
    implements org.j8unit.repository.java.security.KeyStoreTests.EntryTests<Entry> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$Entry]

        @Override
        public Entry createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyStore.Entry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$Entry]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$Entry]

        @RunWith(J8Unit4.class)
        public static class AttributeTest
        implements org.j8unit.repository.java.security.KeyStoreTests.EntryTests.AttributeTests<Attribute> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$Entry$Attribute]

            @Override
            public Attribute createNewSUT() {
                throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyStore.Entry.Attribute], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$Entry$Attribute]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$Entry$Attribute]

        }

    }

    @RunWith(J8Unit4.class)
    public static class TrustedCertificateEntryTest
    implements org.j8unit.repository.java.security.KeyStoreTests.TrustedCertificateEntryTests<TrustedCertificateEntry> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$TrustedCertificateEntry]

        @Override
        public TrustedCertificateEntry createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyStore.TrustedCertificateEntry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$TrustedCertificateEntry]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$TrustedCertificateEntry]

    }

    @RunWith(J8Unit4.class)
    public static class PasswordProtectionTest
    implements org.j8unit.repository.java.security.KeyStoreTests.PasswordProtectionTests<PasswordProtection> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$PasswordProtection]

        @Override
        public PasswordProtection createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyStore.PasswordProtection], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$PasswordProtection]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$PasswordProtection]

    }

    @RunWith(J8Unit4.class)
    public static class LoadStoreParameterTest
    implements org.j8unit.repository.java.security.KeyStoreTests.LoadStoreParameterTests<LoadStoreParameter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$LoadStoreParameter]

        @Override
        public LoadStoreParameter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyStore.LoadStoreParameter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$LoadStoreParameter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$LoadStoreParameter]

    }

    @RunWith(J8Unit4.class)
    public static class ProtectionParameterTest
    implements org.j8unit.repository.java.security.KeyStoreTests.ProtectionParameterTests<ProtectionParameter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$ProtectionParameter]

        @Override
        public ProtectionParameter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyStore.ProtectionParameter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$ProtectionParameter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$ProtectionParameter]

    }

    @RunWith(J8Unit4.class)
    public static class CallbackHandlerProtectionTest
    implements org.j8unit.repository.java.security.KeyStoreTests.CallbackHandlerProtectionTests<CallbackHandlerProtection> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStore$CallbackHandlerProtection]

        @Override
        public CallbackHandlerProtection createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyStore.CallbackHandlerProtection], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStore$CallbackHandlerProtection]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStore$CallbackHandlerProtection]

    }

}
