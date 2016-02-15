package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.ls.LSParserFilter interface org.w3c.dom.ls.LSParserFilter}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link LSParserFilterClassTests}.
 * </p>
 *
 * @see org.w3c.dom.ls.LSParserFilter interface org.w3c.dom.ls.LSParserFilter (the hereby targeted class-under-test
 *      class)
 * @see LSParserFilterClassTests LSParserFilterClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LSParserFilterTests<SUT extends org.w3c.dom.ls.LSParserFilter>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSParserFilter#startElement(org.w3c.dom.Element) public abstract short
     * org.w3c.dom.ls.LSParserFilter.startElement(org.w3c.dom.Element)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSParserFilter#startElement(org.w3c.dom.Element) public abstract short
     * org.w3c.dom.ls.LSParserFilter.startElement(org.w3c.dom.Element)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.ls.LSParserFilter#startElement(org.w3c.dom.Element) public abstract short
     *      org.w3c.dom.ls.LSParserFilter.startElement(org.w3c.dom.Element) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startElement_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSParserFilter#acceptNode(org.w3c.dom.Node) public abstract short
     * org.w3c.dom.ls.LSParserFilter.acceptNode(org.w3c.dom.Node)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSParserFilter#acceptNode(org.w3c.dom.Node) public abstract short
     * org.w3c.dom.ls.LSParserFilter.acceptNode(org.w3c.dom.Node)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.ls.LSParserFilter#acceptNode(org.w3c.dom.Node) public abstract short
     *      org.w3c.dom.ls.LSParserFilter.acceptNode(org.w3c.dom.Node) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acceptNode_Node()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSParserFilter#getWhatToShow() public abstract int
     * org.w3c.dom.ls.LSParserFilter.getWhatToShow()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSParserFilter#getWhatToShow() public abstract int
     * org.w3c.dom.ls.LSParserFilter.getWhatToShow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.ls.LSParserFilter#getWhatToShow() public abstract int
     *      org.w3c.dom.ls.LSParserFilter.getWhatToShow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWhatToShow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
