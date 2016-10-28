package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.DTDHandler;

@RunWith(J8Unit4.class)
public class DTDHandlerClassTest
implements org.j8unit.repository.org.xml.sax.DTDHandlerClassTests<DTDHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.DTDHandler]

    @Override
    public Class<DTDHandler> createNewSUT() {
        return DTDHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.DTDHandler]

}
