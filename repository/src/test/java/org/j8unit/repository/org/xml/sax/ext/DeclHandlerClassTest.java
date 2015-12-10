package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DeclHandlerClassTest
implements org.j8unit.repository.org.xml.sax.ext.DeclHandlerClassTests<org.xml.sax.ext.DeclHandler> {

    @Override
    public Class<org.xml.sax.ext.DeclHandler> createNewSUT() {
        return org.xml.sax.ext.DeclHandler.class;
    }

}
