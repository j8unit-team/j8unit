package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorHandlerClassTest
implements org.j8unit.repository.org.xml.sax.ErrorHandlerClassTests<org.xml.sax.ErrorHandler> {

    @Override
    public Class<org.xml.sax.ErrorHandler> createNewSUT() {
        return org.xml.sax.ErrorHandler.class;
    }

}
