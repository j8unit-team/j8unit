package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEventLocator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValidationEventLocator} (by simply
 * reusing the J8Unit test interface {@link ValidationEventLocatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValidationEventLocatorClassTest
implements ValidationEventLocatorClassTests<ValidationEventLocator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.ValidationEventLocator]

    @Override
    public Class<ValidationEventLocator> createNewSUT() {
        return ValidationEventLocator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.ValidationEventLocator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.ValidationEventLocator]

}
