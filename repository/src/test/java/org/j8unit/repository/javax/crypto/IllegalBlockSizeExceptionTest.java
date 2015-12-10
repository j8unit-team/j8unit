package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalBlockSizeExceptionTest
implements org.j8unit.repository.javax.crypto.IllegalBlockSizeExceptionTests<javax.crypto.IllegalBlockSizeException> {

    @Override
    public javax.crypto.IllegalBlockSizeException createNewSUT() {
        return new javax.crypto.IllegalBlockSizeException();
    }

}
