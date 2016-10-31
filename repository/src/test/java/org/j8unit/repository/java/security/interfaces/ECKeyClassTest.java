package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.ECKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECKeyClassTest
implements org.j8unit.repository.java.security.interfaces.ECKeyClassTests<ECKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.ECKey]

    @Override
    public Class<ECKey> createNewSUT() {
        return ECKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.ECKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.ECKey]

}
