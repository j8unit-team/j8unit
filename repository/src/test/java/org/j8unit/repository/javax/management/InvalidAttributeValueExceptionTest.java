package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributeValueExceptionTest
implements org.j8unit.repository.javax.management.InvalidAttributeValueExceptionTests<javax.management.InvalidAttributeValueException> {

    @Override
    public javax.management.InvalidAttributeValueException createNewSUT() {
        return new javax.management.InvalidAttributeValueException();
    }

}
