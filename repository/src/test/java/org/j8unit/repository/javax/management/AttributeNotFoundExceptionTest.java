package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeNotFoundExceptionTest
implements org.j8unit.repository.javax.management.AttributeNotFoundExceptionTests<javax.management.AttributeNotFoundException> {

    @Override
    public javax.management.AttributeNotFoundException createNewSUT() {
        return new javax.management.AttributeNotFoundException();
    }

}
