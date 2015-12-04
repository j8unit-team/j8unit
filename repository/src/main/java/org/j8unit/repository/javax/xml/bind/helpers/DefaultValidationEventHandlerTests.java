package org.j8unit.repository.javax.xml.bind.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.helpers.DefaultValidationEventHandler class
 * javax.xml.bind.helpers.DefaultValidationEventHandler}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.helpers.DefaultValidationEventHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DefaultValidationEventHandlerTests<SUT extends javax.xml.bind.helpers.DefaultValidationEventHandler>
extends org.j8unit.repository.javax.xml.bind.ValidationEventHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.helpers.DefaultValidationEventHandler#handleEvent(javax.xml.bind.ValidationEvent) public
     * boolean javax.xml.bind.helpers.DefaultValidationEventHandler.handleEvent(javax.xml.bind.ValidationEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_handleEvent_ValidationEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
