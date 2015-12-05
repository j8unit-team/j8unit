package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.css.DocumentCSS interface org.w3c.dom.css.DocumentCSS}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.css.DocumentCSSClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocumentCSSTests<SUT extends org.w3c.dom.css.DocumentCSS>
extends org.j8unit.repository.org.w3c.dom.stylesheets.DocumentStyleTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.DocumentCSS#getOverrideStyle(org.w3c.dom.Element,java.lang.String) public
     * abstract org.w3c.dom.css.CSSStyleDeclaration
     * org.w3c.dom.css.DocumentCSS.getOverrideStyle(org.w3c.dom.Element,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOverrideStyle_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}