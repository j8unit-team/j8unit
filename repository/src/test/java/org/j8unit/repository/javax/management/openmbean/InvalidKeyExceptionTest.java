package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidKeyExceptionTest
implements org.j8unit.repository.javax.management.openmbean.InvalidKeyExceptionTests<javax.management.openmbean.InvalidKeyException> {

    @Override
    public javax.management.openmbean.InvalidKeyException createNewSUT() {
        return new javax.management.openmbean.InvalidKeyException();
    }

}
