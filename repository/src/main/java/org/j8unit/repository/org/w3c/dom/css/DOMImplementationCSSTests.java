package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.w3c.dom.css.DOMImplementationCSS;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link DOMImplementationCSS public abstract interface org.w3c.dom.css.DOMImplementationCSS}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.w3c.dom.css.DOMImplementationCSSClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationCSSTests<SUT extends DOMImplementationCSS>
extends org.j8unit.repository.org.w3c.dom.DOMImplementationTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.css.DOMImplementationCSS]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.w3c.dom.css.DOMImplementationCSS#createCSSStyleSheet(String, String) public abstract
     * org.w3c.dom.css.CSSStyleSheet
     * org.w3c.dom.css.DOMImplementationCSS.createCSSStyleSheet(java.lang.String,java.lang.String) throws
     * org.w3c.dom.DOMException}.
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
    public default void test_createCSSStyleSheet_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.css.DOMImplementationCSS]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.css.DOMImplementationCSS]
}
