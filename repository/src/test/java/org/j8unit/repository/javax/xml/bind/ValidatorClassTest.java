package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.Validator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidatorClassTest
implements org.j8unit.repository.javax.xml.bind.ValidatorClassTests<Validator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.Validator]

    @Override
    public Class<Validator> createNewSUT() {
        return Validator.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.Validator]

}
