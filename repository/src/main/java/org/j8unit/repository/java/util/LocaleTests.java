package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Locale class java.util.Locale}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link LocaleClassTests}.
 * </p>
 *
 * @see java.util.Locale class java.util.Locale (the hereby targeted class-under-test class)
 * @see LocaleClassTests LocaleClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocaleTests<SUT extends java.util.Locale>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Locale#hashCode() public int java.util.Locale.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#hashCode() public int java.util.Locale.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#hashCode() public int java.util.Locale.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getExtensionKeys() public java.util.Set
     * <java.lang.Character> java.util.Locale.getExtensionKeys()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getExtensionKeys() public java.util.Set
     * java.util.Locale.getExtensionKeys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getExtensionKeys() public java.util.Set java.util.Locale.getExtensionKeys() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExtensionKeys()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getISO3Language() public java.lang.String
     * java.util.Locale.getISO3Language() throws java.util.MissingResourceException}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getISO3Language() public java.lang.String
     * java.util.Locale.getISO3Language() throws java.util.MissingResourceException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getISO3Language() public java.lang.String java.util.Locale.getISO3Language() throws
     *      java.util.MissingResourceException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getISO3Language()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayCountry() public final java.lang.String
     * java.util.Locale.getDisplayCountry()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayCountry() public final java.lang.String
     * java.util.Locale.getDisplayCountry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayCountry() public final java.lang.String java.util.Locale.getDisplayCountry() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayCountry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayCountry(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayCountry(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayCountry(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayCountry(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayCountry(java.util.Locale) public java.lang.String
     *      java.util.Locale.getDisplayCountry(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayCountry_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#toLanguageTag() public java.lang.String java.util.Locale.toLanguageTag()}
     * .
     *
     * <p>
     * Test method for {@link java.util.Locale#toLanguageTag() public java.lang.String java.util.Locale.toLanguageTag()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#toLanguageTag() public java.lang.String java.util.Locale.toLanguageTag() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toLanguageTag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayVariant() public final java.lang.String
     * java.util.Locale.getDisplayVariant()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayVariant() public final java.lang.String
     * java.util.Locale.getDisplayVariant()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayVariant() public final java.lang.String java.util.Locale.getDisplayVariant() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayVariant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayVariant(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayVariant(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayVariant(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayVariant(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayVariant(java.util.Locale) public java.lang.String
     *      java.util.Locale.getDisplayVariant(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayVariant_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getCountry() public java.lang.String java.util.Locale.getCountry()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getCountry() public java.lang.String java.util.Locale.getCountry()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getCountry() public java.lang.String java.util.Locale.getCountry() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCountry()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getUnicodeLocaleAttributes() public java.util.Set
     * <java.lang.String> java.util.Locale.getUnicodeLocaleAttributes()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getUnicodeLocaleAttributes() public java.util.Set
     * java.util.Locale.getUnicodeLocaleAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getUnicodeLocaleAttributes() public java.util.Set
     *      java.util.Locale.getUnicodeLocaleAttributes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnicodeLocaleAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#stripExtensions() public java.util.Locale
     * java.util.Locale.stripExtensions()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#stripExtensions() public java.util.Locale
     * java.util.Locale.stripExtensions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#stripExtensions() public java.util.Locale java.util.Locale.stripExtensions() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stripExtensions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getISO3Country() public java.lang.String
     * java.util.Locale.getISO3Country() throws java.util.MissingResourceException}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getISO3Country() public java.lang.String
     * java.util.Locale.getISO3Country() throws java.util.MissingResourceException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getISO3Country() public java.lang.String java.util.Locale.getISO3Country() throws
     *      java.util.MissingResourceException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getISO3Country()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getUnicodeLocaleKeys() public java.util.Set
     * <java.lang.String> java.util.Locale.getUnicodeLocaleKeys()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getUnicodeLocaleKeys() public java.util.Set
     * java.util.Locale.getUnicodeLocaleKeys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getUnicodeLocaleKeys() public java.util.Set java.util.Locale.getUnicodeLocaleKeys() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnicodeLocaleKeys()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#equals(Object) public boolean java.util.Locale.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#equals(Object) public boolean java.util.Locale.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#equals(Object) public boolean java.util.Locale.equals(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayName() public final java.lang.String
     * java.util.Locale.getDisplayName()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayName() public final java.lang.String
     * java.util.Locale.getDisplayName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayName() public final java.lang.String java.util.Locale.getDisplayName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayName(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayName(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayName(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayName(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayName(java.util.Locale) public java.lang.String
     *      java.util.Locale.getDisplayName(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#hasExtensions() public boolean java.util.Locale.hasExtensions()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#hasExtensions() public boolean java.util.Locale.hasExtensions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#hasExtensions() public boolean java.util.Locale.hasExtensions() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasExtensions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getUnicodeLocaleType(String) public java.lang.String
     * java.util.Locale.getUnicodeLocaleType(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getUnicodeLocaleType(String) public java.lang.String
     * java.util.Locale.getUnicodeLocaleType(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getUnicodeLocaleType(String) public java.lang.String
     *      java.util.Locale.getUnicodeLocaleType(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnicodeLocaleType_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayLanguage(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayLanguage(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayLanguage(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayLanguage(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayLanguage(java.util.Locale) public java.lang.String
     *      java.util.Locale.getDisplayLanguage(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayLanguage_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayLanguage() public final java.lang.String
     * java.util.Locale.getDisplayLanguage()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayLanguage() public final java.lang.String
     * java.util.Locale.getDisplayLanguage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayLanguage() public final java.lang.String java.util.Locale.getDisplayLanguage()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayLanguage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getScript() public java.lang.String java.util.Locale.getScript()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getScript() public java.lang.String java.util.Locale.getScript()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getScript() public java.lang.String java.util.Locale.getScript() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScript()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#toString() public final java.lang.String java.util.Locale.toString()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#toString() public final java.lang.String java.util.Locale.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#toString() public final java.lang.String java.util.Locale.toString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#clone() public java.lang.Object java.util.Locale.clone()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#clone() public java.lang.Object java.util.Locale.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#clone() public java.lang.Object java.util.Locale.clone() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getVariant() public java.lang.String java.util.Locale.getVariant()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getVariant() public java.lang.String java.util.Locale.getVariant()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getVariant() public java.lang.String java.util.Locale.getVariant() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVariant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getLanguage() public java.lang.String java.util.Locale.getLanguage()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getLanguage() public java.lang.String java.util.Locale.getLanguage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getLanguage() public java.lang.String java.util.Locale.getLanguage() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLanguage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getExtension(char) public java.lang.String
     * java.util.Locale.getExtension(char)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getExtension(char) public java.lang.String
     * java.util.Locale.getExtension(char)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getExtension(char) public java.lang.String java.util.Locale.getExtension(char) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExtension_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayScript() public java.lang.String
     * java.util.Locale.getDisplayScript()}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayScript() public java.lang.String
     * java.util.Locale.getDisplayScript()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayScript() public java.lang.String java.util.Locale.getDisplayScript() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayScript()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Locale#getDisplayScript(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayScript(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.Locale#getDisplayScript(java.util.Locale) public java.lang.String
     * java.util.Locale.getDisplayScript(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Locale#getDisplayScript(java.util.Locale) public java.lang.String
     *      java.util.Locale.getDisplayScript(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayScript_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Locale.Builder class java.util.Locale$Builder}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link LocaleClassTests.BuilderClassTests}.
     * </p>
     *
     * @see java.util.Locale.Builder class java.util.Locale$Builder (the hereby targeted class-under-test class)
     * @see LocaleClassTests.BuilderClassTests LocaleClassTests.BuilderClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BuilderTests<SUT extends java.util.Locale.Builder>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#clear() public java.util.Locale$Builder
         * java.util.Locale$Builder.clear()}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#clear() public java.util.Locale$Builder
         * java.util.Locale$Builder.clear()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#clear() public java.util.Locale$Builder java.util.Locale$Builder.clear() (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_clear()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#addUnicodeLocaleAttribute(String) public
         * java.util.Locale$Builder java.util.Locale$Builder.addUnicodeLocaleAttribute(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#addUnicodeLocaleAttribute(String) public
         * java.util.Locale$Builder java.util.Locale$Builder.addUnicodeLocaleAttribute(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#addUnicodeLocaleAttribute(String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.addUnicodeLocaleAttribute(java.lang.String) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addUnicodeLocaleAttribute_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setUnicodeLocaleKeyword(String, String) public
         * java.util.Locale$Builder java.util.Locale$Builder.setUnicodeLocaleKeyword(java.lang.String,java.lang.String)}
         * .
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setUnicodeLocaleKeyword(String, String) public
         * java.util.Locale$Builder java.util.Locale$Builder.setUnicodeLocaleKeyword(java.lang.String,java.lang.String)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setUnicodeLocaleKeyword(String, String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setUnicodeLocaleKeyword(java.lang.String,java.lang.String) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setUnicodeLocaleKeyword_String_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setLanguageTag(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setLanguageTag(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setLanguageTag(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setLanguageTag(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setLanguageTag(String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setLanguageTag(java.lang.String) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setLanguageTag_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setExtension(char, String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setExtension(char,java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setExtension(char, String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setExtension(char,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setExtension(char, String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setExtension(char,java.lang.String) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setExtension_char_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setRegion(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setRegion(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setRegion(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setRegion(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setRegion(String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setRegion(java.lang.String) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setRegion_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setLanguage(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setLanguage(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setLanguage(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setLanguage(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setLanguage(String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setLanguage(java.lang.String) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setLanguage_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setScript(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setScript(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setScript(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setScript(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setScript(String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setScript(java.lang.String) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setScript_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setLocale(java.util.Locale) public java.util.Locale$Builder
         * java.util.Locale$Builder.setLocale(java.util.Locale)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setLocale(java.util.Locale) public java.util.Locale$Builder
         * java.util.Locale$Builder.setLocale(java.util.Locale)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setLocale(java.util.Locale) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setLocale(java.util.Locale) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setLocale_Locale()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#clearExtensions() public java.util.Locale$Builder
         * java.util.Locale$Builder.clearExtensions()}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#clearExtensions() public java.util.Locale$Builder
         * java.util.Locale$Builder.clearExtensions()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#clearExtensions() public java.util.Locale$Builder
         *      java.util.Locale$Builder.clearExtensions() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_clearExtensions()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#setVariant(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setVariant(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#setVariant(String) public java.util.Locale$Builder
         * java.util.Locale$Builder.setVariant(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#setVariant(String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.setVariant(java.lang.String) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setVariant_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#build() public java.util.Locale
         * java.util.Locale$Builder.build()}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#build() public java.util.Locale
         * java.util.Locale$Builder.build()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#build() public java.util.Locale java.util.Locale$Builder.build() (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_build()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.Builder#removeUnicodeLocaleAttribute(String) public
         * java.util.Locale$Builder java.util.Locale$Builder.removeUnicodeLocaleAttribute(java.lang.String)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.Builder#removeUnicodeLocaleAttribute(String) public
         * java.util.Locale$Builder java.util.Locale$Builder.removeUnicodeLocaleAttribute(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.Builder#removeUnicodeLocaleAttribute(String) public java.util.Locale$Builder
         *      java.util.Locale$Builder.removeUnicodeLocaleAttribute(java.lang.String) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_removeUnicodeLocaleAttribute_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Locale.Category class java.util.Locale$Category}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link LocaleClassTests.CategoryClassTests}.
     * </p>
     *
     * @see java.util.Locale.Category class java.util.Locale$Category (the hereby targeted class-under-test class)
     * @see LocaleClassTests.CategoryClassTests LocaleClassTests.CategoryClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CategoryTests<SUT extends java.util.Locale.Category>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.util.Locale.Category> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Locale.LanguageRange class java.util.Locale$LanguageRange}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link LocaleClassTests.LanguageRangeClassTests}.
     * </p>
     *
     * @see java.util.Locale.LanguageRange class java.util.Locale$LanguageRange (the hereby targeted class-under-test
     *      class)
     * @see LocaleClassTests.LanguageRangeClassTests LocaleClassTests.LanguageRangeClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LanguageRangeTests<SUT extends java.util.Locale.LanguageRange>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#hashCode() public int
         * java.util.Locale$LanguageRange.hashCode()}.
         *
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#hashCode() public int
         * java.util.Locale$LanguageRange.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.LanguageRange#hashCode() public int java.util.Locale$LanguageRange.hashCode() (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_hashCode()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#getWeight() public double
         * java.util.Locale$LanguageRange.getWeight()}.
         *
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#getWeight() public double
         * java.util.Locale$LanguageRange.getWeight()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.LanguageRange#getWeight() public double java.util.Locale$LanguageRange.getWeight() (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getWeight()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#getRange() public java.lang.String
         * java.util.Locale$LanguageRange.getRange()}.
         *
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#getRange() public java.lang.String
         * java.util.Locale$LanguageRange.getRange()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.LanguageRange#getRange() public java.lang.String
         *      java.util.Locale$LanguageRange.getRange() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getRange()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#equals(Object) public boolean
         * java.util.Locale$LanguageRange.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.util.Locale.LanguageRange#equals(Object) public boolean
         * java.util.Locale$LanguageRange.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.Locale.LanguageRange#equals(Object) public boolean
         *      java.util.Locale$LanguageRange.equals(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_equals_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.Locale.FilteringMode class java.util.Locale$FilteringMode}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link LocaleClassTests.FilteringModeClassTests}.
     * </p>
     *
     * @see java.util.Locale.FilteringMode class java.util.Locale$FilteringMode (the hereby targeted class-under-test
     *      class)
     * @see LocaleClassTests.FilteringModeClassTests LocaleClassTests.FilteringModeClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilteringModeTests<SUT extends java.util.Locale.FilteringMode>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.util.Locale.FilteringMode> {

    }

}
