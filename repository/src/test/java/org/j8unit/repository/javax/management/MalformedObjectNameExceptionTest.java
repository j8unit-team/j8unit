package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedObjectNameExceptionTest
implements org.j8unit.repository.javax.management.MalformedObjectNameExceptionTests<javax.management.MalformedObjectNameException> {

    @Override
    public javax.management.MalformedObjectNameException createNewSUT() {
        return new javax.management.MalformedObjectNameException();
    }

}
