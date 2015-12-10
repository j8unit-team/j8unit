package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidatorClassTest
implements org.j8unit.repository.javax.xml.bind.ValidatorClassTests<javax.xml.bind.Validator> {

    @Override
    public Class<javax.xml.bind.Validator> createNewSUT() {
        return javax.xml.bind.Validator.class;
    }

}
