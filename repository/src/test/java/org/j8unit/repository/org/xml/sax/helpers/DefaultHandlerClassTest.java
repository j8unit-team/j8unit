package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultHandlerClassTest
implements org.j8unit.repository.org.xml.sax.helpers.DefaultHandlerClassTests<org.xml.sax.helpers.DefaultHandler> {

    @Override
    public Class<org.xml.sax.helpers.DefaultHandler> createNewSUT() {
        return org.xml.sax.helpers.DefaultHandler.class;
    }

}
