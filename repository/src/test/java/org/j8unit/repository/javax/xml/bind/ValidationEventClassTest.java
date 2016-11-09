package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValidationEvent} (by simply reusing the
 * J8Unit test interface {@link ValidationEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValidationEventClassTest
implements ValidationEventClassTests<ValidationEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.ValidationEvent]

    @Override
    public Class<ValidationEvent> createNewSUT() {
        return ValidationEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.ValidationEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.ValidationEvent]

}
