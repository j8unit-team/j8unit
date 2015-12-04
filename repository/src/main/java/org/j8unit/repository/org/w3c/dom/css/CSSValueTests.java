package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.css.CSSValue interface org.w3c.dom.css.CSSValue}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.css.CSSValueClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CSSValueTests<SUT extends org.w3c.dom.css.CSSValue>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSValue#setCssText(java.lang.String) public abstract void
     * org.w3c.dom.css.CSSValue.setCssText(java.lang.String) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCssText_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSValue#getCssText() public abstract java.lang.String
     * org.w3c.dom.css.CSSValue.getCssText()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCssText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSValue#getCssValueType() public abstract short
     * org.w3c.dom.css.CSSValue.getCssValueType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCssValueType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
