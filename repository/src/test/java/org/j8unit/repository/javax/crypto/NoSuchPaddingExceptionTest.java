package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchPaddingExceptionTest
implements org.j8unit.repository.javax.crypto.NoSuchPaddingExceptionTests<javax.crypto.NoSuchPaddingException> {

    @Override
    public javax.crypto.NoSuchPaddingException createNewSUT() {
        return new javax.crypto.NoSuchPaddingException();
    }

}