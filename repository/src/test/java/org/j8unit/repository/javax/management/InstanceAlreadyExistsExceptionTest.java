package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstanceAlreadyExistsExceptionTest
implements org.j8unit.repository.javax.management.InstanceAlreadyExistsExceptionTests<javax.management.InstanceAlreadyExistsException> {

    @Override
    public javax.management.InstanceAlreadyExistsException createNewSUT() {
        return new javax.management.InstanceAlreadyExistsException();
    }

}
