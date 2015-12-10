package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstanceAlreadyExistsExceptionClassTest
implements org.j8unit.repository.javax.management.InstanceAlreadyExistsExceptionClassTests<javax.management.InstanceAlreadyExistsException> {

    @Override
    public Class<javax.management.InstanceAlreadyExistsException> createNewSUT() {
        return javax.management.InstanceAlreadyExistsException.class;
    }

}
