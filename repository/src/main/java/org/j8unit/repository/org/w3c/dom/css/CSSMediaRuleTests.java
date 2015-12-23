package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.css.CSSMediaRule interface org.w3c.dom.css.CSSMediaRule},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.css.CSSMediaRuleTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.css.CSSMediaRuleClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.css.CSSMediaRule
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSMediaRuleTests<SUT extends org.w3c.dom.css.CSSMediaRule>
extends org.j8unit.repository.org.w3c.dom.css.CSSRuleTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSMediaRule#deleteRule(int) public abstract void
     * org.w3c.dom.css.CSSMediaRule.deleteRule(int) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.css.CSSMediaRule#deleteRule(int)
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
     * Test method for {@link org.w3c.dom.css.CSSMediaRule#getCssRules() public abstract org.w3c.dom.css.CSSRuleList
     * org.w3c.dom.css.CSSMediaRule.getCssRules()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.css.CSSMediaRule#getCssRules()
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
     * Test method for {@link org.w3c.dom.css.CSSMediaRule#getMedia() public abstract org.w3c.dom.stylesheets.MediaList
     * org.w3c.dom.css.CSSMediaRule.getMedia()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.css.CSSMediaRule#getMedia()
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

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSMediaRule#insertRule(java.lang.String, int) public abstract int
     * org.w3c.dom.css.CSSMediaRule.insertRule(java.lang.String,int) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.css.CSSMediaRule#insertRule(java.lang.String, int)
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
