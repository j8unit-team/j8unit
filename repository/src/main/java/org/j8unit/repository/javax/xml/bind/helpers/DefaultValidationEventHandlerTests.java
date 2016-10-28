package org.j8unit.repository.javax.xml.bind.helpers;

import javax.xml.bind.helpers.DefaultValidationEventHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link DefaultValidationEventHandler public class javax.xml.bind.helpers.DefaultValidationEventHandler}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.bind.helpers.DefaultValidationEventHandlerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultValidationEventHandlerTests<SUT extends DefaultValidationEventHandler>
extends org.j8unit.repository.javax.xml.bind.ValidationEventHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.bind.helpers.DefaultValidationEventHandler#handleEvent(javax.xml.bind.ValidationEvent) public
     * boolean javax.xml.bind.helpers.DefaultValidationEventHandler.handleEvent(javax.xml.bind.ValidationEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_handleEvent_ValidationEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

}
