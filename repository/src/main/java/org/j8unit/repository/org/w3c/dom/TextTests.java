package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.Text interface org.w3c.dom.Text}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link TextClassTests}.
 * </p>
 *
 * @see org.w3c.dom.Text interface org.w3c.dom.Text (the hereby targeted class-under-test class)
 * @see TextClassTests TextClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextTests<SUT extends org.w3c.dom.Text>
extends CharacterDataTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Text#replaceWholeText(String) public abstract org.w3c.dom.Text
     * org.w3c.dom.Text.replaceWholeText(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Text#replaceWholeText(String) public abstract org.w3c.dom.Text
     * org.w3c.dom.Text.replaceWholeText(java.lang.String) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Text#replaceWholeText(String) public abstract org.w3c.dom.Text
     *      org.w3c.dom.Text.replaceWholeText(java.lang.String) throws org.w3c.dom.DOMException (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for {@link org.w3c.dom.Text#getWholeText() public abstract java.lang.String
     * org.w3c.dom.Text.getWholeText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Text#getWholeText() public abstract java.lang.String org.w3c.dom.Text.getWholeText() (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link org.w3c.dom.Text#isElementContentWhitespace() public abstract boolean
     * org.w3c.dom.Text.isElementContentWhitespace()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Text#isElementContentWhitespace() public abstract boolean
     *      org.w3c.dom.Text.isElementContentWhitespace() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link org.w3c.dom.Text#splitText(int) public abstract org.w3c.dom.Text
     * org.w3c.dom.Text.splitText(int) throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Text#splitText(int) public abstract org.w3c.dom.Text org.w3c.dom.Text.splitText(int) throws
     *      org.w3c.dom.DOMException (the hereby targeted method-under-test)
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
