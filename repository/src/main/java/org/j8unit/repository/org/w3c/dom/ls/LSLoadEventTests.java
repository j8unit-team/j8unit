package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.ls.LSLoadEvent interface org.w3c.dom.ls.LSLoadEvent}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.ls.LSLoadEventClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LSLoadEventTests<SUT extends org.w3c.dom.ls.LSLoadEvent>
extends org.j8unit.repository.org.w3c.dom.events.EventTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSLoadEvent#getInput() public abstract org.w3c.dom.ls.LSInput
     * org.w3c.dom.ls.LSLoadEvent.getInput()}.
     * </p>
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
     * Test method for {@link org.w3c.dom.ls.LSLoadEvent#getNewDocument() public abstract org.w3c.dom.Document
     * org.w3c.dom.ls.LSLoadEvent.getNewDocument()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNewDocument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
