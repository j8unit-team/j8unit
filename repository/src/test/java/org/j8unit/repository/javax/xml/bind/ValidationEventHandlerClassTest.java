package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEventHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationEventHandlerClassTest
implements org.j8unit.repository.javax.xml.bind.ValidationEventHandlerClassTests<ValidationEventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.ValidationEventHandler]

    @Override
    public Class<ValidationEventHandler> createNewSUT() {
        return ValidationEventHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.ValidationEventHandler]

}
