package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECKeyClassTest
implements org.j8unit.repository.java.security.interfaces.ECKeyClassTests<java.security.interfaces.ECKey> {

    @Override
    public Class<java.security.interfaces.ECKey> createNewSUT() {
        return java.security.interfaces.ECKey.class;
    }

}
