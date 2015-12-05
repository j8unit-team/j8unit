package org.j8unit.repository.javax.xml.bind;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.ValidationEventHandler interface javax.xml.bind.ValidationEventHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.ValidationEventHandlerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValidationEventHandlerTests<SUT extends javax.xml.bind.ValidationEventHandler>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEventHandler#handleEvent(javax.xml.bind.ValidationEvent) public
     * abstract boolean javax.xml.bind.ValidationEventHandler.handleEvent(javax.xml.bind.ValidationEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleEvent_ValidationEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}