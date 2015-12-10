package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationEventHandlerClassTest
implements org.j8unit.repository.javax.xml.bind.ValidationEventHandlerClassTests<javax.xml.bind.ValidationEventHandler> {

    @Override
    public Class<javax.xml.bind.ValidationEventHandler> createNewSUT() {
        return javax.xml.bind.ValidationEventHandler.class;
    }

}
