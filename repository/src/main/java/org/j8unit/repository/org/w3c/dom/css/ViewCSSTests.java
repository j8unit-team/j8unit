package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.org.w3c.dom.views.AbstractViewTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.w3c.dom.css.ViewCSS;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link ViewCSS public
 * abstract interface org.w3c.dom.css.ViewCSS}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.w3c.dom.css.ViewCSSClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ViewCSSTests<SUT extends ViewCSS>
extends AbstractViewTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.css.ViewCSS]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.w3c.dom.css.ViewCSS#getComputedStyle(org.w3c.dom.Element, String) public abstract
     * org.w3c.dom.css.CSSStyleDeclaration
     * org.w3c.dom.css.ViewCSS.getComputedStyle(org.w3c.dom.Element,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComputedStyle_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.css.ViewCSS]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.css.ViewCSS]

}
