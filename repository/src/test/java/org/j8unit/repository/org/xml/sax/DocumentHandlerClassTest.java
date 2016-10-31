package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.DocumentHandler;

@RunWith(J8Unit4.class)
public class DocumentHandlerClassTest
implements org.j8unit.repository.org.xml.sax.DocumentHandlerClassTests<DocumentHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.DocumentHandler]

    @Override
    public Class<DocumentHandler> createNewSUT() {
        return DocumentHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.DocumentHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.DocumentHandler]

}
