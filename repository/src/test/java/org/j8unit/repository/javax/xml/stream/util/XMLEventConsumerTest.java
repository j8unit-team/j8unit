package org.j8unit.repository.javax.xml.stream.util;

import javax.xml.stream.util.XMLEventConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLEventConsumer} (by simply reusing
 * the J8Unit test interface {@link XMLEventConsumerTests}).
 */

@RunWith(J8Unit4.class)
public class XMLEventConsumerTest
implements XMLEventConsumerTests<XMLEventConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.util.XMLEventConsumer]

    @Override
    public XMLEventConsumer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.util.XMLEventConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.util.XMLEventConsumer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.util.XMLEventConsumer]

}
