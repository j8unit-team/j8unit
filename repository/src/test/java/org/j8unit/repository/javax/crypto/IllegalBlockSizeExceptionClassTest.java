package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalBlockSizeExceptionClassTest
implements org.j8unit.repository.javax.crypto.IllegalBlockSizeExceptionClassTests<javax.crypto.IllegalBlockSizeException> {

    @Override
    public Class<javax.crypto.IllegalBlockSizeException> createNewSUT() {
        return javax.crypto.IllegalBlockSizeException.class;
    }

}
