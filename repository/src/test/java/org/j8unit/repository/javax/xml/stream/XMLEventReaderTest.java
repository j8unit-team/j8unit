package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLEventReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLEventReader} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLEventReaderTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class XMLEventReaderTest
implements XMLEventReaderTests<XMLEventReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLEventReader]

    @Override
    public XMLEventReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLEventReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLEventReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLEventReader]

}
