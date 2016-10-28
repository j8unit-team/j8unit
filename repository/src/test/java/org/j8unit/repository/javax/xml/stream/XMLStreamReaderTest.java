package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLStreamReaderTest
implements org.j8unit.repository.javax.xml.stream.XMLStreamReaderTests<XMLStreamReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLStreamReader]

    @Override
    public XMLStreamReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLStreamReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLStreamReader]

}
