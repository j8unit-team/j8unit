package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLEventFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEventFactoryTest
implements org.j8unit.repository.javax.xml.stream.XMLEventFactoryTests<XMLEventFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLEventFactory]

    @Override
    public XMLEventFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLEventFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLEventFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLEventFactory]

}
