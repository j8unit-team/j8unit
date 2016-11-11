package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ParseConversionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ParseConversionEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.ParseConversionEventTests}).
 */

@RunWith(J8Unit4.class)
public class ParseConversionEventTest
implements ParseConversionEventTests<ParseConversionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.ParseConversionEvent]

    @Override
    public ParseConversionEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.ParseConversionEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.ParseConversionEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.ParseConversionEvent]

}
