package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DTDHandlerClassTest
implements org.j8unit.repository.org.xml.sax.DTDHandlerClassTests<org.xml.sax.DTDHandler> {

    @Override
    public Class<org.xml.sax.DTDHandler> createNewSUT() {
        return org.xml.sax.DTDHandler.class;
    }

}
