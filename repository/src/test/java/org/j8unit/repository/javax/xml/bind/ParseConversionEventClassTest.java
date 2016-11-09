package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ParseConversionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParseConversionEvent} (by simply reusing
 * the J8Unit test interface {@link ParseConversionEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class ParseConversionEventClassTest
implements ParseConversionEventClassTests<ParseConversionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.ParseConversionEvent]

    @Override
    public Class<ParseConversionEvent> createNewSUT() {
        return ParseConversionEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.ParseConversionEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.ParseConversionEvent]

}
