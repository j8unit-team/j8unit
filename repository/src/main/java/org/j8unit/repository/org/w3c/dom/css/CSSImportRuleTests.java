package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.css.CSSImportRule interface org.w3c.dom.css.CSSImportRule}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CSSImportRuleClassTests}.
 * </p>
 *
 * @see org.w3c.dom.css.CSSImportRule interface org.w3c.dom.css.CSSImportRule (the hereby targeted class-under-test
 *      class)
 * @see CSSImportRuleClassTests CSSImportRuleClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSImportRuleTests<SUT extends org.w3c.dom.css.CSSImportRule>
extends CSSRuleTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getStyleSheet() public abstract
     * org.w3c.dom.css.CSSStyleSheet org.w3c.dom.css.CSSImportRule.getStyleSheet()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getStyleSheet() public abstract
     * org.w3c.dom.css.CSSStyleSheet org.w3c.dom.css.CSSImportRule.getStyleSheet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.CSSImportRule#getStyleSheet() public abstract org.w3c.dom.css.CSSStyleSheet
     *      org.w3c.dom.css.CSSImportRule.getStyleSheet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyleSheet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getHref() public abstract java.lang.String
     * org.w3c.dom.css.CSSImportRule.getHref()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getHref() public abstract java.lang.String
     * org.w3c.dom.css.CSSImportRule.getHref()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.CSSImportRule#getHref() public abstract java.lang.String
     *      org.w3c.dom.css.CSSImportRule.getHref() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHref()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getMedia() public abstract org.w3c.dom.stylesheets.MediaList
     * org.w3c.dom.css.CSSImportRule.getMedia()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getMedia() public abstract org.w3c.dom.stylesheets.MediaList
     * org.w3c.dom.css.CSSImportRule.getMedia()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.CSSImportRule#getMedia() public abstract org.w3c.dom.stylesheets.MediaList
     *      org.w3c.dom.css.CSSImportRule.getMedia() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMedia()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
