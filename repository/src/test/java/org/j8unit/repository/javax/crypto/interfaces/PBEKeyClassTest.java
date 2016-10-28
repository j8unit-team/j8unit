package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.PBEKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PBEKeyClassTest
implements org.j8unit.repository.javax.crypto.interfaces.PBEKeyClassTests<PBEKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.interfaces.PBEKey]

    @Override
    public Class<PBEKey> createNewSUT() {
        return PBEKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.interfaces.PBEKey]

}
