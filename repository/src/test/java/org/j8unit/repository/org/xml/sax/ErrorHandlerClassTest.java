package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ErrorHandler;

@RunWith(J8Unit4.class)
public class ErrorHandlerClassTest
implements org.j8unit.repository.org.xml.sax.ErrorHandlerClassTests<ErrorHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ErrorHandler]

    @Override
    public Class<ErrorHandler> createNewSUT() {
        return ErrorHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ErrorHandler]

}
