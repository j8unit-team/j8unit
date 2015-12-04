package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.w3c.dom.stylesheets.StyleSheetList interface org.w3c.dom.stylesheets.StyleSheetList},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.stylesheets.StyleSheetListClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StyleSheetListTests<SUT extends org.w3c.dom.stylesheets.StyleSheetList>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.stylesheets.StyleSheetList#getLength() public abstract int org.w3c.dom.stylesheets.StyleSheetList.getLength()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLength() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.stylesheets.StyleSheetList#item(int) public abstract org.w3c.dom.stylesheets.StyleSheet org.w3c.dom.stylesheets.StyleSheetList.item(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_item_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
