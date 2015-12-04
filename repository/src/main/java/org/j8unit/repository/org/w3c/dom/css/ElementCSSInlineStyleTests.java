package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.w3c.dom.css.ElementCSSInlineStyle interface org.w3c.dom.css.ElementCSSInlineStyle},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.css.ElementCSSInlineStyleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ElementCSSInlineStyleTests<SUT extends org.w3c.dom.css.ElementCSSInlineStyle>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.ElementCSSInlineStyle#getStyle() public abstract org.w3c.dom.css.CSSStyleDeclaration org.w3c.dom.css.ElementCSSInlineStyle.getStyle()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyle() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
