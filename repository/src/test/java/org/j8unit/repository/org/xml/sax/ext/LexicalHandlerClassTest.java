package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ext.LexicalHandler;

@RunWith(J8Unit4.class)
public class LexicalHandlerClassTest
implements org.j8unit.repository.org.xml.sax.ext.LexicalHandlerClassTests<LexicalHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.LexicalHandler]

    @Override
    public Class<LexicalHandler> createNewSUT() {
        return LexicalHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.LexicalHandler]

}
