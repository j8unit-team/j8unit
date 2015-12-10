package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationExceptionTest
implements org.j8unit.repository.javax.xml.bind.ValidationExceptionTests<javax.xml.bind.ValidationException> {

    @Override
    public javax.xml.bind.ValidationException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.xml.bind.ValidationException] available.");
    }

}
