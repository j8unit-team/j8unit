package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.PrintConversionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintConversionEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.PrintConversionEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintConversionEventClassTest
implements PrintConversionEventClassTests<PrintConversionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.PrintConversionEvent]

    @Override
    public Class<PrintConversionEvent> createNewSUT() {
        return PrintConversionEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.PrintConversionEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.PrintConversionEvent]

}
