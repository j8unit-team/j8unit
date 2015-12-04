package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.UIDefaults class javax.swing.UIDefaults}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.UIDefaultsTests}.
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
 * @see org.j8unit.repository.javax.swing.UIDefaultsTests
 */
@Category(J8UnitRepository.class)
public abstract interface UIDefaultsClassTests<SUT extends Class<? extends javax.swing.UIDefaults>>
extends org.j8unit.repository.java.util.HashtableClassTests<SUT, java.lang.Object, java.lang.Object> {

    /**
     * Test method for {@link javax.swing.UIDefaults#UIDefaults(java.lang.Object[]) public
     * javax.swing.UIDefaults(java.lang.Object[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UIDefaults_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.UIDefaults sut = null; // = new UIDefaults(java.lang.Object[]);
    }

    /**
     * Test method for {@link javax.swing.UIDefaults#UIDefaults(int,float) public javax.swing.UIDefaults(int,float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UIDefaults_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.UIDefaults sut = null; // = new UIDefaults(int,float);
    }

    /**
     * Test method for {@link javax.swing.UIDefaults#UIDefaults() public javax.swing.UIDefaults()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UIDefaults()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.UIDefaults sut = null; // = new UIDefaults();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.UIDefaults> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.UIDefaults.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.UIDefaults$LazyInputMap class javax.swing.UIDefaults$LazyInputMap}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.UIDefaultsTests.LazyInputMapTests}.
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
     * @see org.j8unit.repository.javax.swing.UIDefaultsTests.LazyInputMapTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LazyInputMapClassTests<SUT extends Class<? extends javax.swing.UIDefaults.LazyInputMap>>
    extends org.j8unit.repository.javax.swing.UIDefaultsClassTests.LazyValueClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.UIDefaults.LazyInputMap#LazyInputMap(java.lang.Object[]) public
         * javax.swing.UIDefaults$LazyInputMap(java.lang.Object[])}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LazyInputMap_ObjectArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.UIDefaults.LazyInputMap sut = null; // = new LazyInputMap(java.lang.Object[]);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.UIDefaults.LazyInputMap> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.UIDefaults.LazyInputMap.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.UIDefaults$LazyValue interface javax.swing.UIDefaults$LazyValue}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.UIDefaultsTests.LazyValueTests}.
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
     * @see org.j8unit.repository.javax.swing.UIDefaultsTests.LazyValueTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LazyValueClassTests<SUT extends Class<? extends javax.swing.UIDefaults.LazyValue>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.UIDefaults.LazyValue> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.UIDefaults.LazyValue.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.UIDefaults$ActiveValue interface javax.swing.UIDefaults$ActiveValue},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.UIDefaultsTests.ActiveValueTests}.
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
     * @see org.j8unit.repository.javax.swing.UIDefaultsTests.ActiveValueTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ActiveValueClassTests<SUT extends Class<? extends javax.swing.UIDefaults.ActiveValue>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.UIDefaults.ActiveValue> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.UIDefaults.ActiveValue.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.UIDefaults$ProxyLazyValue class javax.swing.UIDefaults$ProxyLazyValue},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.UIDefaultsTests.ProxyLazyValueTests}.
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
     * @see org.j8unit.repository.javax.swing.UIDefaultsTests.ProxyLazyValueTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ProxyLazyValueClassTests<SUT extends Class<? extends javax.swing.UIDefaults.ProxyLazyValue>>
    extends org.j8unit.repository.javax.swing.UIDefaultsClassTests.LazyValueClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(java.lang.String,java.lang.String,java.lang.Object[])
         * public javax.swing.UIDefaults$ProxyLazyValue(java.lang.String,java.lang.String,java.lang.Object[])}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ProxyLazyValue_String_String_ObjectArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.UIDefaults.ProxyLazyValue sut = null; // = new
                                                                    // ProxyLazyValue(java.lang.String,java.lang.String,java.lang.Object[]);
        }

        /**
         * Test method for
         * {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(java.lang.String,java.lang.Object[]) public
         * javax.swing.UIDefaults$ProxyLazyValue(java.lang.String,java.lang.Object[])}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ProxyLazyValue_String_ObjectArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.UIDefaults.ProxyLazyValue sut = null; // = new
                                                                    // ProxyLazyValue(java.lang.String,java.lang.Object[]);
        }

        /**
         * Test method for
         * {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(java.lang.String,java.lang.String) public
         * javax.swing.UIDefaults$ProxyLazyValue(java.lang.String,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ProxyLazyValue_String_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.UIDefaults.ProxyLazyValue sut = null; // = new
                                                                    // ProxyLazyValue(java.lang.String,java.lang.String);
        }

        /**
         * Test method for {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(java.lang.String) public
         * javax.swing.UIDefaults$ProxyLazyValue(java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ProxyLazyValue_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.UIDefaults.ProxyLazyValue sut = null; // = new ProxyLazyValue(java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.UIDefaults.ProxyLazyValue> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.UIDefaults.ProxyLazyValue.class.isAssignableFrom(sut));
        }

    }

}
