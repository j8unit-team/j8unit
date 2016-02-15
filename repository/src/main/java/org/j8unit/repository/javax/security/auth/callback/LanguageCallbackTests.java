package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.callback.LanguageCallback class
 * javax.security.auth.callback.LanguageCallback}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link LanguageCallbackClassTests}.
 * </p>
 *
 * @see javax.security.auth.callback.LanguageCallback class javax.security.auth.callback.LanguageCallback (the hereby
 *      targeted class-under-test class)
 * @see LanguageCallbackClassTests LanguageCallbackClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LanguageCallbackTests<SUT extends javax.security.auth.callback.LanguageCallback>
extends CallbackTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.LanguageCallback#getLocale() public java.util.Locale
     * javax.security.auth.callback.LanguageCallback.getLocale()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.LanguageCallback#getLocale() public java.util.Locale
     * javax.security.auth.callback.LanguageCallback.getLocale()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.LanguageCallback#getLocale() public java.util.Locale
     *      javax.security.auth.callback.LanguageCallback.getLocale() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.LanguageCallback#setLocale(java.util.Locale) public void
     * javax.security.auth.callback.LanguageCallback.setLocale(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.LanguageCallback#setLocale(java.util.Locale) public void
     * javax.security.auth.callback.LanguageCallback.setLocale(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.LanguageCallback#setLocale(java.util.Locale) public void
     *      javax.security.auth.callback.LanguageCallback.setLocale(java.util.Locale) (the hereby targeted
     *      method-under-test)
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

}
