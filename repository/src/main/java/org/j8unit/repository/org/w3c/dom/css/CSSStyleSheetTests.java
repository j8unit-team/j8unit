package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.css.CSSStyleSheet interface org.w3c.dom.css.CSSStyleSheet}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.css.CSSStyleSheetClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSStyleSheetTests<SUT extends org.w3c.dom.css.CSSStyleSheet>
extends org.j8unit.repository.org.w3c.dom.stylesheets.StyleSheetTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSStyleSheet#deleteRule(int) public abstract void
     * org.w3c.dom.css.CSSStyleSheet.deleteRule(int) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteRule_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSStyleSheet#getCssRules() public abstract org.w3c.dom.css.CSSRuleList
     * org.w3c.dom.css.CSSStyleSheet.getCssRules()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCssRules()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSStyleSheet#getOwnerRule() public abstract org.w3c.dom.css.CSSRule
     * org.w3c.dom.css.CSSStyleSheet.getOwnerRule()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOwnerRule()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSStyleSheet#insertRule(java.lang.String,int) public abstract int
     * org.w3c.dom.css.CSSStyleSheet.insertRule(java.lang.String,int) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertRule_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
