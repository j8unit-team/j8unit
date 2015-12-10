package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadPaddingExceptionTest
implements org.j8unit.repository.javax.crypto.BadPaddingExceptionTests<javax.crypto.BadPaddingException> {

    @Override
    public javax.crypto.BadPaddingException createNewSUT() {
        return new javax.crypto.BadPaddingException();
    }

}
