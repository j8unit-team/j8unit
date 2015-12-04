package org.j8unit.repository.java.security;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.KeyStore class java.security.KeyStore}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.security.KeyStoreTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.KeyStoreTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyStoreClassTests<SUT extends Class<? extends java.security.KeyStore>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$Builder class java.security.KeyStore$Builder}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.BuilderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.BuilderTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderClassTests<SUT extends Class<? extends java.security.KeyStore.Builder>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.security.KeyStore.Builder#newInstance(java.security.KeyStore,java.security.KeyStore.ProtectionParameter)
         * public static java.security.KeyStore$Builder
         * java.security.KeyStore$Builder.newInstance(java.security.KeyStore,java.security.KeyStore$ProtectionParameter)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_newInstance_KeyStore_ProtectionParameter()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.security.KeyStore.Builder#newInstance(java.lang.String,java.security.Provider,java.io.File,java.security.KeyStore.ProtectionParameter)
         * public static java.security.KeyStore$Builder
         * java.security.KeyStore$Builder.newInstance(java.lang.String,java.security.Provider,java.io.File,java.security.KeyStore$ProtectionParameter)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_newInstance_String_Provider_File_ProtectionParameter()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.security.KeyStore.Builder#newInstance(java.lang.String,java.security.Provider,java.security.KeyStore.ProtectionParameter)
         * public static java.security.KeyStore$Builder
         * java.security.KeyStore$Builder.newInstance(java.lang.String,java.security.Provider,java.security.KeyStore$ProtectionParameter)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_newInstance_String_Provider_ProtectionParameter()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.Builder> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.Builder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$CallbackHandlerProtection class
     * java.security.KeyStore$CallbackHandlerProtection}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.CallbackHandlerProtectionTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.CallbackHandlerProtectionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CallbackHandlerProtectionClassTests<SUT extends Class<? extends java.security.KeyStore.CallbackHandlerProtection>>
    extends org.j8unit.repository.java.security.KeyStoreClassTests.ProtectionParameterClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link java.security.KeyStore.CallbackHandlerProtection#CallbackHandlerProtection(javax.security.auth.callback.CallbackHandler)
         * public java.security.KeyStore$CallbackHandlerProtection(javax.security.auth.callback.CallbackHandler)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CallbackHandlerProtection_CallbackHandler()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.CallbackHandlerProtection sut = null; // = new
                                                                               // CallbackHandlerProtection(javax.security.auth.callback.CallbackHandler);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.CallbackHandlerProtection> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.CallbackHandlerProtection.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$Entry interface java.security.KeyStore$Entry}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.EntryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.EntryTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface EntryClassTests<SUT extends Class<? extends java.security.KeyStore.Entry>>
    extends J8UnitTest<SUT> {

        /**
         * <p>
         * Test class for {@link java.security.KeyStore$Entry$Attribute interface
         * java.security.KeyStore$Entry$Attribute}, containing all class relevant test methods (at least the test
         * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
         * containing the instance relevant test methods is
         * {@link org.j8unit.repository.java.security.KeyStoreTests.EntryTests.AttributeTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.java.security.KeyStoreTests.EntryTests.AttributeTests
         */
        @Category(J8UnitRepository.class)
        public static abstract interface AttributeClassTests<SUT extends Class<? extends java.security.KeyStore.Entry.Attribute>>
        extends J8UnitTest<SUT> {

            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<? extends java.security.KeyStore.Entry.Attribute> sut = createNewSUT();
                // assert assignability
                assertTrue(java.security.KeyStore.Entry.Attribute.class.isAssignableFrom(sut));
            }

        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.Entry> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.Entry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$LoadStoreParameter interface
     * java.security.KeyStore$LoadStoreParameter}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
     * instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.LoadStoreParameterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.LoadStoreParameterTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LoadStoreParameterClassTests<SUT extends Class<? extends java.security.KeyStore.LoadStoreParameter>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.LoadStoreParameter> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.LoadStoreParameter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$PasswordProtection class java.security.KeyStore$PasswordProtection},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.PasswordProtectionTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.PasswordProtectionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PasswordProtectionClassTests<SUT extends Class<? extends java.security.KeyStore.PasswordProtection>>
    extends org.j8unit.repository.java.security.KeyStoreClassTests.ProtectionParameterClassTests<SUT>,
    org.j8unit.repository.javax.security.auth.DestroyableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.security.KeyStore.PasswordProtection#PasswordProtection(char[]) public
         * java.security.KeyStore$PasswordProtection(char[])}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PasswordProtection_charArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.PasswordProtection sut = null; // = new PasswordProtection(char[]);
        }

        /**
         * Test method for
         * {@link java.security.KeyStore.PasswordProtection#PasswordProtection(char[],java.lang.String,java.security.spec.AlgorithmParameterSpec)
         * public
         * java.security.KeyStore$PasswordProtection(char[],java.lang.String,java.security.spec.AlgorithmParameterSpec)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PasswordProtection_charArray_String_AlgorithmParameterSpec()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.PasswordProtection sut = null; // = new
                                                                        // PasswordProtection(char[],java.lang.String,java.security.spec.AlgorithmParameterSpec);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.PasswordProtection> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.PasswordProtection.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$PrivateKeyEntry class java.security.KeyStore$PrivateKeyEntry},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.PrivateKeyEntryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.PrivateKeyEntryTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PrivateKeyEntryClassTests<SUT extends Class<? extends java.security.KeyStore.PrivateKeyEntry>>
    extends org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link java.security.KeyStore.PrivateKeyEntry#PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[])
         * public java.security.KeyStore$PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[])}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PrivateKeyEntry_PrivateKey_CertificateArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.PrivateKeyEntry sut = null; // = new
                                                                     // PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[]);
        }

        /**
         * Test method for
         * {@link java.security.KeyStore.PrivateKeyEntry#PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[],java.util.Set)
         * public
         * java.security.KeyStore$PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[],java.util.Set)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PrivateKeyEntry_PrivateKey_CertificateArray_Set()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.PrivateKeyEntry sut = null; // = new
                                                                     // PrivateKeyEntry(java.security.PrivateKey,java.security.cert.Certificate[],java.util.Set);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.PrivateKeyEntry> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.PrivateKeyEntry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$ProtectionParameter interface
     * java.security.KeyStore$ProtectionParameter}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.ProtectionParameterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.ProtectionParameterTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ProtectionParameterClassTests<SUT extends Class<? extends java.security.KeyStore.ProtectionParameter>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.ProtectionParameter> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.ProtectionParameter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$SecretKeyEntry class java.security.KeyStore$SecretKeyEntry},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.SecretKeyEntryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.SecretKeyEntryTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SecretKeyEntryClassTests<SUT extends Class<? extends java.security.KeyStore.SecretKeyEntry>>
    extends org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.security.KeyStore.SecretKeyEntry#SecretKeyEntry(javax.crypto.SecretKey) public
         * java.security.KeyStore$SecretKeyEntry(javax.crypto.SecretKey)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SecretKeyEntry_SecretKey()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.SecretKeyEntry sut = null; // = new SecretKeyEntry(javax.crypto.SecretKey);
        }

        /**
         * Test method for
         * {@link java.security.KeyStore.SecretKeyEntry#SecretKeyEntry(javax.crypto.SecretKey,java.util.Set) public
         * java.security.KeyStore$SecretKeyEntry(javax.crypto.SecretKey,java.util.Set)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SecretKeyEntry_SecretKey_Set()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.SecretKeyEntry sut = null; // = new
                                                                    // SecretKeyEntry(javax.crypto.SecretKey,java.util.Set);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.SecretKeyEntry> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.SecretKeyEntry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.KeyStore$TrustedCertificateEntry class
     * java.security.KeyStore$TrustedCertificateEntry}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.KeyStoreTests.TrustedCertificateEntryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.KeyStoreTests.TrustedCertificateEntryTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TrustedCertificateEntryClassTests<SUT extends Class<? extends java.security.KeyStore.TrustedCertificateEntry>>
    extends org.j8unit.repository.java.security.KeyStoreClassTests.EntryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link java.security.KeyStore.TrustedCertificateEntry#TrustedCertificateEntry(java.security.cert.Certificate)
         * public java.security.KeyStore$TrustedCertificateEntry(java.security.cert.Certificate)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TrustedCertificateEntry_Certificate()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.TrustedCertificateEntry sut = null; // = new
                                                                             // TrustedCertificateEntry(java.security.cert.Certificate);
        }

        /**
         * Test method for
         * {@link java.security.KeyStore.TrustedCertificateEntry#TrustedCertificateEntry(java.security.cert.Certificate,java.util.Set)
         * public java.security.KeyStore$TrustedCertificateEntry(java.security.cert.Certificate,java.util.Set)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TrustedCertificateEntry_Certificate_Set()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.security.KeyStore.TrustedCertificateEntry sut = null; // = new
                                                                             // TrustedCertificateEntry(java.security.cert.Certificate,java.util.Set);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.KeyStore.TrustedCertificateEntry> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.KeyStore.TrustedCertificateEntry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getDefaultType() public static final java.lang.String
     * java.security.KeyStore.getDefaultType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getInstance(java.lang.String) public static java.security.KeyStore
     * java.security.KeyStore.getInstance(java.lang.String) throws java.security.KeyStoreException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getInstance(java.lang.String,java.security.Provider) public static
     * java.security.KeyStore java.security.KeyStore.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.KeyStoreException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_Provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyStore#getInstance(java.lang.String,java.lang.String) public static
     * java.security.KeyStore java.security.KeyStore.getInstance(java.lang.String,java.lang.String) throws
     * java.security.KeyStoreException,java.security.NoSuchProviderException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.security.KeyStore> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.KeyStore.class.isAssignableFrom(sut));
    }

}
