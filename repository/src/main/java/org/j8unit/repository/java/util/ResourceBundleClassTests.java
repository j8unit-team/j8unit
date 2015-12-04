package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.ResourceBundle class java.util.ResourceBundle}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.ResourceBundleTests}.
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
 * @see org.j8unit.repository.java.util.ResourceBundleTests
 */
@Category(J8UnitRepository.class)
public abstract interface ResourceBundleClassTests<SUT extends Class<? extends java.util.ResourceBundle>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.util.ResourceBundle#ResourceBundle() public java.util.ResourceBundle()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ResourceBundle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.ResourceBundle sut = null; // = new ResourceBundle();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.ResourceBundle> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.ResourceBundle.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.ResourceBundle#getBundle(java.lang.String,java.util.Locale,java.lang.ClassLoader,java.util.ResourceBundle.Control)
     * public static java.util.ResourceBundle
     * java.util.ResourceBundle.getBundle(java.lang.String,java.util.Locale,java.lang.ClassLoader,java.util.ResourceBundle$Control)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBundle_String_Locale_ClassLoader_Control()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ResourceBundle#getBundle(java.lang.String) public static final
     * java.util.ResourceBundle java.util.ResourceBundle.getBundle(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBundle_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.ResourceBundle#getBundle(java.lang.String,java.util.Locale,java.util.ResourceBundle.Control)
     * public static final java.util.ResourceBundle
     * java.util.ResourceBundle.getBundle(java.lang.String,java.util.Locale,java.util.ResourceBundle$Control)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBundle_String_Locale_Control()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ResourceBundle#getBundle(java.lang.String,java.util.Locale) public static final
     * java.util.ResourceBundle java.util.ResourceBundle.getBundle(java.lang.String,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBundle_String_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.ResourceBundle#getBundle(java.lang.String,java.util.Locale,java.lang.ClassLoader) public static
     * java.util.ResourceBundle
     * java.util.ResourceBundle.getBundle(java.lang.String,java.util.Locale,java.lang.ClassLoader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBundle_String_Locale_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ResourceBundle#getBundle(java.lang.String,java.util.ResourceBundle.Control)
     * public static final java.util.ResourceBundle
     * java.util.ResourceBundle.getBundle(java.lang.String,java.util.ResourceBundle$Control)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBundle_String_Control()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ResourceBundle#clearCache() public static final void
     * java.util.ResourceBundle.clearCache()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clearCache()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ResourceBundle#clearCache(java.lang.ClassLoader) public static final void
     * java.util.ResourceBundle.clearCache(java.lang.ClassLoader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clearCache_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.util.ResourceBundle$Control class java.util.ResourceBundle$Control}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.ResourceBundleTests.ControlTests}.
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
     * @see org.j8unit.repository.java.util.ResourceBundleTests.ControlTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ControlClassTests<SUT extends Class<? extends java.util.ResourceBundle.Control>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.ResourceBundle.Control> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.ResourceBundle.Control.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link java.util.ResourceBundle.Control#getNoFallbackControl(java.util.List) public static
         * final java.util.ResourceBundle$Control java.util.ResourceBundle$Control.getNoFallbackControl(java.util.List)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getNoFallbackControl_List()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.ResourceBundle.Control#getControl(java.util.List) public static final
         * java.util.ResourceBundle$Control java.util.ResourceBundle$Control.getControl(java.util.List)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getControl_List()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
