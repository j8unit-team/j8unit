package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.StartElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StartElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.StartElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class StartElementClassTest
implements StartElementClassTests<StartElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.StartElement]

    @Override
    public Class<StartElement> createNewSUT() {
        return StartElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.StartElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.StartElement]

}
