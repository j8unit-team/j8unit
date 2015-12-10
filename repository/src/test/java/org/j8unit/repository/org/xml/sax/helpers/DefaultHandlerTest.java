package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultHandlerTest
implements org.j8unit.repository.org.xml.sax.helpers.DefaultHandlerTests<org.xml.sax.helpers.DefaultHandler> {

    @Override
    public org.xml.sax.helpers.DefaultHandler createNewSUT() {
        return new org.xml.sax.helpers.DefaultHandler();
    }

}
