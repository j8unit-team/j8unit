package org.j8unit.repository.javax.xml.validation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidatorClassTest
implements org.j8unit.repository.javax.xml.validation.ValidatorClassTests<javax.xml.validation.Validator> {

    @Override
    public Class<javax.xml.validation.Validator> createNewSUT() {
        return javax.xml.validation.Validator.class;
    }

}
