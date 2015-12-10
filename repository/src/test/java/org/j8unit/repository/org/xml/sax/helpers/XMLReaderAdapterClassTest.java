package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLReaderAdapterClassTest
implements org.j8unit.repository.org.xml.sax.helpers.XMLReaderAdapterClassTests<org.xml.sax.helpers.XMLReaderAdapter> {

    @Override
    public Class<org.xml.sax.helpers.XMLReaderAdapter> createNewSUT() {
        return org.xml.sax.helpers.XMLReaderAdapter.class;
    }

}
