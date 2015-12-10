package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLReaderFactoryClassTest
implements org.j8unit.repository.org.xml.sax.helpers.XMLReaderFactoryClassTests<org.xml.sax.helpers.XMLReaderFactory> {

    @Override
    public Class<org.xml.sax.helpers.XMLReaderFactory> createNewSUT() {
        return org.xml.sax.helpers.XMLReaderFactory.class;
    }

}
