package org.j8unit.repository.java.security;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface for {@linkplain java.security.KeyStore class java.security.KeyStore}, containing all
 * type relevant aspects (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the
 * runtime type of this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
 * complementarySetup test interface containing the instance relevant aspects (see {@link KeyStoreTests}).
 * </p>
 *
 * <p>
 * <strong>What? Testing the class itself? What is it good for?</strong>
 * </p>
 *
 * <p>
 * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable test
 * methods:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()},
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()},
 * and {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is {@link KeyStoreTests}.
 * </p>
 *
 * @see java.security.KeyStore class java.security.KeyStore (the hereby targeted class-under-test class)
 * @see KeyStoreTests KeyStoreTests (The complementary j8unit test interface containing the instance relevant test
 *      methods)
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyStoreClassTests<SUT extends java.security.KeyStore>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class) (the
     *      hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Override
    @BeforeClass
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.class!",
                   java.security.KeyStore.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.Entry interface
     * java.security.KeyStore$Entry}, containing all type relevant aspects (e.&thinsp;g., runtime constraints and
     * further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic type
     * is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see {@link KeyStoreTests.EntryTests}
     * ).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.EntryTests}.
     * </p>
     *
     * @see java.security.KeyStore.Entry interface java.security.KeyStore$Entry (the hereby targeted class-under-test
     *      class)
     * @see KeyStoreTests.EntryTests KeyStoreTests.EntryTests (The complementary j8unit test interface containing the
     *      instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EntryClassTests<SUT extends java.security.KeyStore.Entry>
    extends RepositoryClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.Entry.class!",
                       java.security.KeyStore.Entry.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain java.security.KeyStore.Entry.Attribute interface
         * java.security.KeyStore$Entry$Attribute}, containing all type relevant aspects (e.&thinsp;g., runtime
         * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
         * interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link KeyStoreTests.EntryTests.AttributeTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link KeyStoreTests.EntryTests.AttributeTests}.
         * </p>
         *
         * @see java.security.KeyStore.Entry.Attribute interface java.security.KeyStore$Entry$Attribute (the hereby
         *      targeted class-under-test class)
         * @see KeyStoreTests.EntryTests.AttributeTests KeyStoreTests.EntryTests.AttributeTests (The complementary
         *      j8unit test interface containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface AttributeClassTests<SUT extends java.security.KeyStore.Entry.Attribute>
        extends RepositoryClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.Entry.Attribute.class!",
                           java.security.KeyStore.Entry.Attribute.class.isAssignableFrom(sut));
            }

        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.PrivateKeyEntry class
     * java.security.KeyStore$PrivateKeyEntry}, containing all type relevant aspects (e.&thinsp;g., runtime constraints
     * and further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic
     * type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.PrivateKeyEntryTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.PrivateKeyEntryTests}.
     * </p>
     *
     * @see java.security.KeyStore.PrivateKeyEntry class java.security.KeyStore$PrivateKeyEntry (the hereby targeted
     *      class-under-test class)
     * @see KeyStoreTests.PrivateKeyEntryTests KeyStoreTests.PrivateKeyEntryTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PrivateKeyEntryClassTests<SUT extends java.security.KeyStore.PrivateKeyEntry>
    extends KeyStoreClassTests.EntryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.PrivateKeyEntry.class!",
                       java.security.KeyStore.PrivateKeyEntry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.LoadStoreParameter interface
     * java.security.KeyStore$LoadStoreParameter}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.LoadStoreParameterTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.LoadStoreParameterTests}.
     * </p>
     *
     * @see java.security.KeyStore.LoadStoreParameter interface java.security.KeyStore$LoadStoreParameter (the hereby
     *      targeted class-under-test class)
     * @see KeyStoreTests.LoadStoreParameterTests KeyStoreTests.LoadStoreParameterTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LoadStoreParameterClassTests<SUT extends java.security.KeyStore.LoadStoreParameter>
    extends RepositoryClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.LoadStoreParameter.class!",
                       java.security.KeyStore.LoadStoreParameter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.CallbackHandlerProtection class
     * java.security.KeyStore$CallbackHandlerProtection}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.CallbackHandlerProtectionTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.CallbackHandlerProtectionTests}.
     * </p>
     *
     * @see java.security.KeyStore.CallbackHandlerProtection class java.security.KeyStore$CallbackHandlerProtection (the
     *      hereby targeted class-under-test class)
     * @see KeyStoreTests.CallbackHandlerProtectionTests KeyStoreTests.CallbackHandlerProtectionTests (The complementary
     *      j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CallbackHandlerProtectionClassTests<SUT extends java.security.KeyStore.CallbackHandlerProtection>
    extends KeyStoreClassTests.ProtectionParameterClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.CallbackHandlerProtection.class!",
                       java.security.KeyStore.CallbackHandlerProtection.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.PasswordProtection class
     * java.security.KeyStore$PasswordProtection}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.PasswordProtectionTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.PasswordProtectionTests}.
     * </p>
     *
     * @see java.security.KeyStore.PasswordProtection class java.security.KeyStore$PasswordProtection (the hereby
     *      targeted class-under-test class)
     * @see KeyStoreTests.PasswordProtectionTests KeyStoreTests.PasswordProtectionTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PasswordProtectionClassTests<SUT extends java.security.KeyStore.PasswordProtection>
    extends KeyStoreClassTests.ProtectionParameterClassTests<SUT>, org.j8unit.repository.javax.security.auth.DestroyableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.PasswordProtection.class!",
                       java.security.KeyStore.PasswordProtection.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.TrustedCertificateEntry class
     * java.security.KeyStore$TrustedCertificateEntry}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.TrustedCertificateEntryTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.TrustedCertificateEntryTests}.
     * </p>
     *
     * @see java.security.KeyStore.TrustedCertificateEntry class java.security.KeyStore$TrustedCertificateEntry (the
     *      hereby targeted class-under-test class)
     * @see KeyStoreTests.TrustedCertificateEntryTests KeyStoreTests.TrustedCertificateEntryTests (The complementary
     *      j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TrustedCertificateEntryClassTests<SUT extends java.security.KeyStore.TrustedCertificateEntry>
    extends KeyStoreClassTests.EntryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.TrustedCertificateEntry.class!",
                       java.security.KeyStore.TrustedCertificateEntry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.Builder class
     * java.security.KeyStore$Builder}, containing all type relevant aspects (e.&thinsp;g., runtime constraints and
     * further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic type
     * is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.BuilderTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.BuilderTests}.
     * </p>
     *
     * @see java.security.KeyStore.Builder class java.security.KeyStore$Builder (the hereby targeted class-under-test
     *      class)
     * @see KeyStoreTests.BuilderTests KeyStoreTests.BuilderTests (The complementary j8unit test interface containing
     *      the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderClassTests<SUT extends java.security.KeyStore.Builder>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.Builder.class!",
                       java.security.KeyStore.Builder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.SecretKeyEntry class
     * java.security.KeyStore$SecretKeyEntry}, containing all type relevant aspects (e.&thinsp;g., runtime constraints
     * and further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic
     * type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.SecretKeyEntryTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.SecretKeyEntryTests}.
     * </p>
     *
     * @see java.security.KeyStore.SecretKeyEntry class java.security.KeyStore$SecretKeyEntry (the hereby targeted
     *      class-under-test class)
     * @see KeyStoreTests.SecretKeyEntryTests KeyStoreTests.SecretKeyEntryTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SecretKeyEntryClassTests<SUT extends java.security.KeyStore.SecretKeyEntry>
    extends KeyStoreClassTests.EntryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.SecretKeyEntry.class!",
                       java.security.KeyStore.SecretKeyEntry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.security.KeyStore.ProtectionParameter interface
     * java.security.KeyStore$ProtectionParameter}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link KeyStoreTests.ProtectionParameterTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link KeyStoreTests.ProtectionParameterTests}.
     * </p>
     *
     * @see java.security.KeyStore.ProtectionParameter interface java.security.KeyStore$ProtectionParameter (the hereby
     *      targeted class-under-test class)
     * @see KeyStoreTests.ProtectionParameterTests KeyStoreTests.ProtectionParameterTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ProtectionParameterClassTests<SUT extends java.security.KeyStore.ProtectionParameter>
    extends RepositoryClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.security.KeyStore.ProtectionParameter.class!",
                       java.security.KeyStore.ProtectionParameter.class.isAssignableFrom(sut));
        }

    }

}
