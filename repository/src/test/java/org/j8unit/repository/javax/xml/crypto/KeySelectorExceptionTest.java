package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeySelectorExceptionTest
implements org.j8unit.repository.javax.xml.crypto.KeySelectorExceptionTests<javax.xml.crypto.KeySelectorException> {

    @Override
    public javax.xml.crypto.KeySelectorException createNewSUT() {
        return new javax.xml.crypto.KeySelectorException();
    }

}
