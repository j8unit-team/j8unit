package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;

@RunWith(J8Unit4.class)
public class ContentHandlerClassTest
implements org.j8unit.repository.org.xml.sax.ContentHandlerClassTests<ContentHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ContentHandler]

    @Override
    public Class<ContentHandler> createNewSUT() {
        return ContentHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ContentHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ContentHandler]

}
