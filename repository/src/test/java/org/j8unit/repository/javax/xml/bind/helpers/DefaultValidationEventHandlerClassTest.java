package org.j8unit.repository.javax.xml.bind.helpers;

import javax.xml.bind.helpers.DefaultValidationEventHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultValidationEventHandler} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.helpers.DefaultValidationEventHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultValidationEventHandlerClassTest
implements DefaultValidationEventHandlerClassTests<DefaultValidationEventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

    @Override
    public Class<DefaultValidationEventHandler> createNewSUT() {
        return DefaultValidationEventHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.helpers.DefaultValidationEventHandler#DefaultValidationEventHandler() public
     * javax.xml.bind.helpers.DefaultValidationEventHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DefaultValidationEventHandler()
    throws Exception {
        // create new instance
        final DefaultValidationEventHandler sut = new DefaultValidationEventHandler();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

}
