package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEventHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValidationEventHandler} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.ValidationEventHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValidationEventHandlerClassTest
implements ValidationEventHandlerClassTests<ValidationEventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.ValidationEventHandler]

    @Override
    public Class<ValidationEventHandler> createNewSUT() {
        return ValidationEventHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.ValidationEventHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.ValidationEventHandler]

}
