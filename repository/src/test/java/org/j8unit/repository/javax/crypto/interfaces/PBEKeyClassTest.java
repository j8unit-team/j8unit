package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PBEKeyClassTest
implements org.j8unit.repository.javax.crypto.interfaces.PBEKeyClassTests<javax.crypto.interfaces.PBEKey> {

    @Override
    public Class<javax.crypto.interfaces.PBEKey> createNewSUT() {
        return javax.crypto.interfaces.PBEKey.class;
    }

}
