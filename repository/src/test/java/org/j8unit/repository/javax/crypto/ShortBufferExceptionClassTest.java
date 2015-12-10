package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortBufferExceptionClassTest
implements org.j8unit.repository.javax.crypto.ShortBufferExceptionClassTests<javax.crypto.ShortBufferException> {

    @Override
    public Class<javax.crypto.ShortBufferException> createNewSUT() {
        return javax.crypto.ShortBufferException.class;
    }

}
