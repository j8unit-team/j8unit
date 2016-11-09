package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.PrintConversionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintConversionEvent} (by simply
 * reusing the J8Unit test interface {@link PrintConversionEventTests}).
 */

@RunWith(J8Unit4.class)
public class PrintConversionEventTest
implements PrintConversionEventTests<PrintConversionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.PrintConversionEvent]

    @Override
    public PrintConversionEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.PrintConversionEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.PrintConversionEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.PrintConversionEvent]

}
