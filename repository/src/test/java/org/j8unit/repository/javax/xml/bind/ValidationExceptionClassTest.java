package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationExceptionClassTest
implements org.j8unit.repository.javax.xml.bind.ValidationExceptionClassTests<javax.xml.bind.ValidationException> {

    @Override
    public Class<javax.xml.bind.ValidationException> createNewSUT() {
        return javax.xml.bind.ValidationException.class;
    }

}
