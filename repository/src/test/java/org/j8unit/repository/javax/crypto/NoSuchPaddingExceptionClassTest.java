package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchPaddingExceptionClassTest
implements org.j8unit.repository.javax.crypto.NoSuchPaddingExceptionClassTests<javax.crypto.NoSuchPaddingException> {

    @Override
    public Class<javax.crypto.NoSuchPaddingException> createNewSUT() {
        return javax.crypto.NoSuchPaddingException.class;
    }

}
