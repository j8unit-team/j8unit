package org.j8unit.repository.javax.xml.validation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidatorHandlerClassTest
implements org.j8unit.repository.javax.xml.validation.ValidatorHandlerClassTests<javax.xml.validation.ValidatorHandler> {

    @Override
    public Class<javax.xml.validation.ValidatorHandler> createNewSUT() {
        return javax.xml.validation.ValidatorHandler.class;
    }

}
