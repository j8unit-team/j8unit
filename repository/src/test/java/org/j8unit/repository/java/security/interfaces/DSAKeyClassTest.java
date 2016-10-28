package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAKeyClassTest
implements org.j8unit.repository.java.security.interfaces.DSAKeyClassTests<DSAKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAKey]

    @Override
    public Class<DSAKey> createNewSUT() {
        return DSAKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAKey]

}
