package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.XMLFilter;

@RunWith(J8Unit4.class)
public class XMLFilterClassTest
implements org.j8unit.repository.org.xml.sax.XMLFilterClassTests<XMLFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.XMLFilter]

    @Override
    public Class<XMLFilter> createNewSUT() {
        return XMLFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.XMLFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.XMLFilter]

}
