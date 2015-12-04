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
 * Test class for {@link org.w3c.dom.css.CSSCharsetRule interface org.w3c.dom.css.CSSCharsetRule},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.css.CSSCharsetRuleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CSSCharsetRuleTests<SUT extends org.w3c.dom.css.CSSCharsetRule>
extends org.j8unit.repository.org.w3c.dom.css.CSSRuleTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSCharsetRule#getEncoding() public abstract java.lang.String org.w3c.dom.css.CSSCharsetRule.getEncoding()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoding() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSCharsetRule#setEncoding(java.lang.String) public abstract void org.w3c.dom.css.CSSCharsetRule.setEncoding(java.lang.String) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEncoding_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
