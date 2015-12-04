package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.Text interface org.w3c.dom.Text}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.TextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TextTests<SUT extends org.w3c.dom.Text>
extends org.j8unit.repository.org.w3c.dom.CharacterDataTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Text#replaceWholeText(java.lang.String) public abstract org.w3c.dom.Text
     * org.w3c.dom.Text.replaceWholeText(java.lang.String) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_replaceWholeText_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Text#getWholeText() public abstract java.lang.String
     * org.w3c.dom.Text.getWholeText()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWholeText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Text#isElementContentWhitespace() public abstract boolean
     * org.w3c.dom.Text.isElementContentWhitespace()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isElementContentWhitespace()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Text#splitText(int) public abstract org.w3c.dom.Text
     * org.w3c.dom.Text.splitText(int) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_splitText_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
