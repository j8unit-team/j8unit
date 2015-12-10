package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchMechanismExceptionTest
implements org.j8unit.repository.javax.xml.crypto.NoSuchMechanismExceptionTests<javax.xml.crypto.NoSuchMechanismException> {

    @Override
    public javax.xml.crypto.NoSuchMechanismException createNewSUT() {
        return new javax.xml.crypto.NoSuchMechanismException();
    }

}
