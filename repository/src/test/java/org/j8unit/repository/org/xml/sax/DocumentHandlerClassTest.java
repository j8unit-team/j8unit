package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentHandlerClassTest
implements org.j8unit.repository.org.xml.sax.DocumentHandlerClassTests<org.xml.sax.DocumentHandler> {

    @Override
    public Class<org.xml.sax.DocumentHandler> createNewSUT() {
        return org.xml.sax.DocumentHandler.class;
    }

}
