package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Locale class java.util.Locale}, containing all class relevant test methods (at least
 * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.util.LocaleTests}.
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
 * @see org.j8unit.repository.java.util.LocaleTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocaleClassTests<SUT extends Class<? extends java.util.Locale>>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.Locale$Builder class java.util.Locale$Builder}, containing all class relevant
     * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.LocaleTests.BuilderTests}.
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
     * @see org.j8unit.repository.java.util.LocaleTests.BuilderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderClassTests<SUT extends Class<? extends java.util.Locale.Builder>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.Locale.Builder#Builder() public java.util.Locale$Builder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Builder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.Locale.Builder sut = null; // = new Builder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.Locale.Builder> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Locale.Builder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Locale$Category class java.util.Locale$Category}, containing all class relevant
     * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.LocaleTests.CategoryTests}.
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
     * @see org.j8unit.repository.java.util.LocaleTests.CategoryTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CategoryClassTests<SUT extends Class<? extends java.util.Locale.Category>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.util.Locale.Category> {

        /**
         * <p>
         * Test method for {@link java.util.Locale.Category#valueOf(java.lang.String) public static
         * java.util.Locale$Category java.util.Locale$Category.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Category#values() public static java.util.Locale$Category[]
         * java.util.Locale$Category.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
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
            final Class<? extends java.util.Locale.Category> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Locale.Category.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Locale$FilteringMode class java.util.Locale$FilteringMode}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.LocaleTests.FilteringModeTests}.
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
     * @see org.j8unit.repository.java.util.LocaleTests.FilteringModeTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilteringModeClassTests<SUT extends Class<? extends java.util.Locale.FilteringMode>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.util.Locale.FilteringMode> {

        /**
         * <p>
         * Test method for {@link java.util.Locale.FilteringMode#valueOf(java.lang.String) public static
         * java.util.Locale$FilteringMode java.util.Locale$FilteringMode.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.FilteringMode#values() public static java.util.Locale$FilteringMode[]
         * java.util.Locale$FilteringMode.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
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
            final Class<? extends java.util.Locale.FilteringMode> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Locale.FilteringMode.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Locale$LanguageRange class java.util.Locale$LanguageRange}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.LocaleTests.LanguageRangeTests}.
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
     * @see org.j8unit.repository.java.util.LocaleTests.LanguageRangeTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LanguageRangeClassTests<SUT extends Class<? extends java.util.Locale.LanguageRange>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.Locale.LanguageRange#LanguageRange(java.lang.String) public
         * java.util.Locale$LanguageRange(java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LanguageRange_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.Locale.LanguageRange sut = null; // = new LanguageRange(java.lang.String);
        }

        /**
         * Test method for {@link java.util.Locale.LanguageRange#LanguageRange(java.lang.String,double) public
         * java.util.Locale$LanguageRange(java.lang.String,double)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LanguageRange_String_double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.Locale.LanguageRange sut = null; // = new LanguageRange(java.lang.String,double);
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#mapEquivalents(java.util.List,java.util.Map) public
         * static java.util.List java.util.Locale$LanguageRange.mapEquivalents(java.util.List,java.util.Map)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_mapEquivalents_List_Map()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#parse(java.lang.String) public static java.util.List
         * java.util.Locale$LanguageRange.parse(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_parse_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#parse(java.lang.String,java.util.Map) public static
         * java.util.List java.util.Locale$LanguageRange.parse(java.lang.String,java.util.Map)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_parse_String_Map()
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
            final Class<? extends java.util.Locale.LanguageRange> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Locale.LanguageRange.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.util.Locale#Locale(java.lang.String) public java.util.Locale(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Locale_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Locale sut = null; // = new Locale(java.lang.String);
    }

    /**
     * Test method for {@link java.util.Locale#Locale(java.lang.String,java.lang.String) public
     * java.util.Locale(java.lang.String,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Locale_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Locale sut = null; // = new Locale(java.lang.String,java.lang.String);
    }

    /**
     * Test method for {@link java.util.Locale#Locale(java.lang.String,java.lang.String,java.lang.String) public
     * java.util.Locale(java.lang.String,java.lang.String,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Locale_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Locale sut = null; // = new Locale(java.lang.String,java.lang.String,java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#filter(java.util.List,java.util.Collection) public static java.util.List
     * java.util.Locale.filter(java.util.List,java.util.Collection)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filter_List_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.Locale#filter(java.util.List,java.util.Collection,java.util.Locale.FilteringMode) public static
     * java.util.List java.util.Locale.filter(java.util.List,java.util.Collection,java.util.Locale$FilteringMode)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filter_List_Collection_FilteringMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#filterTags(java.util.List,java.util.Collection) public static
     * java.util.List java.util.Locale.filterTags(java.util.List,java.util.Collection)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filterTags_List_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.Locale#filterTags(java.util.List,java.util.Collection,java.util.Locale.FilteringMode) public
     * static java.util.List
     * java.util.Locale.filterTags(java.util.List,java.util.Collection,java.util.Locale$FilteringMode)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filterTags_List_Collection_FilteringMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#forLanguageTag(java.lang.String) public static java.util.Locale
     * java.util.Locale.forLanguageTag(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forLanguageTag_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getAvailableLocales() public static java.util.Locale[]
     * java.util.Locale.getAvailableLocales()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAvailableLocales()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDefault() public static java.util.Locale
     * java.util.Locale.getDefault()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefault()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDefault(java.util.Locale.Category) public static java.util.Locale
     * java.util.Locale.getDefault(java.util.Locale$Category)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefault_Category()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getISOCountries() public static java.lang.String[]
     * java.util.Locale.getISOCountries()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getISOCountries()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getISOLanguages() public static java.lang.String[]
     * java.util.Locale.getISOLanguages()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getISOLanguages()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#lookup(java.util.List,java.util.Collection) public static
     * java.util.Locale java.util.Locale.lookup(java.util.List,java.util.Collection)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookup_List_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#lookupTag(java.util.List,java.util.Collection) public static
     * java.lang.String java.util.Locale.lookupTag(java.util.List,java.util.Collection)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupTag_List_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#setDefault(java.util.Locale.Category,java.util.Locale) public static
     * synchronized void java.util.Locale.setDefault(java.util.Locale$Category,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefault_Category_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#setDefault(java.util.Locale) public static synchronized void
     * java.util.Locale.setDefault(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefault_Locale()
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
        final Class<? extends java.util.Locale> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Locale.class.isAssignableFrom(sut));
    }

}
