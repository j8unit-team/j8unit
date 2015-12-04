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
 * Test class for {@link org.w3c.dom.css.CSSImportRule interface org.w3c.dom.css.CSSImportRule},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.css.CSSImportRuleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CSSImportRuleTests<SUT extends org.w3c.dom.css.CSSImportRule>
extends org.j8unit.repository.org.w3c.dom.css.CSSRuleTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getStyleSheet() public abstract org.w3c.dom.css.CSSStyleSheet org.w3c.dom.css.CSSImportRule.getStyleSheet()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyleSheet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getHref() public abstract java.lang.String org.w3c.dom.css.CSSImportRule.getHref()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHref() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSImportRule#getMedia() public abstract org.w3c.dom.stylesheets.MediaList org.w3c.dom.css.CSSImportRule.getMedia()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMedia() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
