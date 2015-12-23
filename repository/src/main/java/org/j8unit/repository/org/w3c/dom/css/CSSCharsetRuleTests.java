package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.css.CSSCharsetRule interface
 * org.w3c.dom.css.CSSCharsetRule}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.css.CSSCharsetRuleTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.css.CSSCharsetRuleClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.css.CSSCharsetRule
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSCharsetRuleTests<SUT extends org.w3c.dom.css.CSSCharsetRule>
extends org.j8unit.repository.org.w3c.dom.css.CSSRuleTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSCharsetRule#getEncoding() public abstract java.lang.String
     * org.w3c.dom.css.CSSCharsetRule.getEncoding()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.css.CSSCharsetRule#getEncoding()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSCharsetRule#setEncoding(java.lang.String) public abstract void
     * org.w3c.dom.css.CSSCharsetRule.setEncoding(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.css.CSSCharsetRule#setEncoding(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEncoding_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
