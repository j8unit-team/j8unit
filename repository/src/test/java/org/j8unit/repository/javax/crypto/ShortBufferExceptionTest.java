package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortBufferExceptionTest
implements org.j8unit.repository.javax.crypto.ShortBufferExceptionTests<javax.crypto.ShortBufferException> {

    @Override
    public javax.crypto.ShortBufferException createNewSUT() {
        return new javax.crypto.ShortBufferException();
    }

}
