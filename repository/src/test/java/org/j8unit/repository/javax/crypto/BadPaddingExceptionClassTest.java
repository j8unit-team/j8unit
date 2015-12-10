package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadPaddingExceptionClassTest
implements org.j8unit.repository.javax.crypto.BadPaddingExceptionClassTests<javax.crypto.BadPaddingException> {

    @Override
    public Class<javax.crypto.BadPaddingException> createNewSUT() {
        return javax.crypto.BadPaddingException.class;
    }

}
