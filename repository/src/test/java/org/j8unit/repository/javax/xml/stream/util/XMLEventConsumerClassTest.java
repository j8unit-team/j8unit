package org.j8unit.repository.javax.xml.stream.util;

import javax.xml.stream.util.XMLEventConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLEventConsumer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.util.XMLEventConsumerClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLEventConsumerClassTest
implements XMLEventConsumerClassTests<XMLEventConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.util.XMLEventConsumer]

    @Override
    public Class<XMLEventConsumer> createNewSUT() {
        return XMLEventConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.util.XMLEventConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.util.XMLEventConsumer]

}
