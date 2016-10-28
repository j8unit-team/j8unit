package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.Validator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidatorClassTest
implements org.j8unit.repository.javax.xml.validation.ValidatorClassTests<Validator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.validation.Validator]

    @Override
    public Class<Validator> createNewSUT() {
        return Validator.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.validation.Validator]

}
