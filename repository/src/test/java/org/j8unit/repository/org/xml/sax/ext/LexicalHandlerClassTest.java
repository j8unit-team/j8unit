package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LexicalHandlerClassTest
implements org.j8unit.repository.org.xml.sax.ext.LexicalHandlerClassTests<org.xml.sax.ext.LexicalHandler> {

    @Override
    public Class<org.xml.sax.ext.LexicalHandler> createNewSUT() {
        return org.xml.sax.ext.LexicalHandler.class;
    }

}
