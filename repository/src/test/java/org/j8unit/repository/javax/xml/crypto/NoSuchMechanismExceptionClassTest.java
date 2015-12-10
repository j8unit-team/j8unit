package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchMechanismExceptionClassTest
implements org.j8unit.repository.javax.xml.crypto.NoSuchMechanismExceptionClassTests<javax.xml.crypto.NoSuchMechanismException> {

    @Override
    public Class<javax.xml.crypto.NoSuchMechanismException> createNewSUT() {
        return javax.xml.crypto.NoSuchMechanismException.class;
    }

}
