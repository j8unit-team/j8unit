package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.XMLReader;

@RunWith(J8Unit4.class)
public class XMLReaderTest
implements org.j8unit.repository.org.xml.sax.XMLReaderTests<XMLReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.XMLReader]

    @Override
    public XMLReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.XMLReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.XMLReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.XMLReader]

}
