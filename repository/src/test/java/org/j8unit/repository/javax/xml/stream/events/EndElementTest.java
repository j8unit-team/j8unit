package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EndElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EndElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.EndElementTests}).
 */
@RunWith(J8Unit4.class)
public class EndElementTest
implements EndElementTests<EndElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.EndElement]

    @Override
    public EndElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.events.EndElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.events.EndElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.events.EndElement]

}
