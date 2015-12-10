package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyAlreadyExistsExceptionTest
implements org.j8unit.repository.javax.management.openmbean.KeyAlreadyExistsExceptionTests<javax.management.openmbean.KeyAlreadyExistsException> {

    @Override
    public javax.management.openmbean.KeyAlreadyExistsException createNewSUT() {
        return new javax.management.openmbean.KeyAlreadyExistsException();
    }

}
