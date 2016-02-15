package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.css.CSSPageRule interface org.w3c.dom.css.CSSPageRule}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CSSPageRuleClassTests}.
 * </p>
 *
 * @see org.w3c.dom.css.CSSPageRule interface org.w3c.dom.css.CSSPageRule (the hereby targeted class-under-test class)
 * @see CSSPageRuleClassTests CSSPageRuleClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSPageRuleTests<SUT extends org.w3c.dom.css.CSSPageRule>
extends CSSRuleTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSPageRule#getStyle() public abstract org.w3c.dom.css.CSSStyleDeclaration
     * org.w3c.dom.css.CSSPageRule.getStyle()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSPageRule#getStyle() public abstract org.w3c.dom.css.CSSStyleDeclaration
     * org.w3c.dom.css.CSSPageRule.getStyle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.CSSPageRule#getStyle() public abstract org.w3c.dom.css.CSSStyleDeclaration
     *      org.w3c.dom.css.CSSPageRule.getStyle() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSPageRule#setSelectorText(String) public abstract void
     * org.w3c.dom.css.CSSPageRule.setSelectorText(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSPageRule#setSelectorText(String) public abstract void
     * org.w3c.dom.css.CSSPageRule.setSelectorText(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.CSSPageRule#setSelectorText(String) public abstract void
     *      org.w3c.dom.css.CSSPageRule.setSelectorText(java.lang.String) throws org.w3c.dom.DOMException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectorText_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSPageRule#getSelectorText() public abstract java.lang.String
     * org.w3c.dom.css.CSSPageRule.getSelectorText()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSPageRule#getSelectorText() public abstract java.lang.String
     * org.w3c.dom.css.CSSPageRule.getSelectorText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.CSSPageRule#getSelectorText() public abstract java.lang.String
     *      org.w3c.dom.css.CSSPageRule.getSelectorText() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectorText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
