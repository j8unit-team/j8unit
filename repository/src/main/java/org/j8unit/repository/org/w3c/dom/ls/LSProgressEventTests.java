package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.ls.LSProgressEvent interface org.w3c.dom.ls.LSProgressEvent}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link LSProgressEventClassTests}.
 * </p>
 *
 * @see org.w3c.dom.ls.LSProgressEvent interface org.w3c.dom.ls.LSProgressEvent (the hereby targeted class-under-test
 *      class)
 * @see LSProgressEventClassTests LSProgressEventClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LSProgressEventTests<SUT extends org.w3c.dom.ls.LSProgressEvent>
extends org.j8unit.repository.org.w3c.dom.events.EventTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getPosition() public abstract int
     * org.w3c.dom.ls.LSProgressEvent.getPosition()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getPosition() public abstract int
     * org.w3c.dom.ls.LSProgressEvent.getPosition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.ls.LSProgressEvent#getPosition() public abstract int
     *      org.w3c.dom.ls.LSProgressEvent.getPosition() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getInput() public abstract org.w3c.dom.ls.LSInput
     * org.w3c.dom.ls.LSProgressEvent.getInput()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getInput() public abstract org.w3c.dom.ls.LSInput
     * org.w3c.dom.ls.LSProgressEvent.getInput()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.ls.LSProgressEvent#getInput() public abstract org.w3c.dom.ls.LSInput
     *      org.w3c.dom.ls.LSProgressEvent.getInput() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getTotalSize() public abstract int
     * org.w3c.dom.ls.LSProgressEvent.getTotalSize()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getTotalSize() public abstract int
     * org.w3c.dom.ls.LSProgressEvent.getTotalSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.ls.LSProgressEvent#getTotalSize() public abstract int
     *      org.w3c.dom.ls.LSProgressEvent.getTotalSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTotalSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
