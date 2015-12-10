package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHKeyClassTest
implements org.j8unit.repository.javax.crypto.interfaces.DHKeyClassTests<javax.crypto.interfaces.DHKey> {

    @Override
    public Class<javax.crypto.interfaces.DHKey> createNewSUT() {
        return javax.crypto.interfaces.DHKey.class;
    }

}
