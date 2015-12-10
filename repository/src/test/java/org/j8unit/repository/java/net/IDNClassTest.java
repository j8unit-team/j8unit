package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IDNClassTest
implements org.j8unit.repository.java.net.IDNClassTests<java.net.IDN> {

    @Override
    public Class<java.net.IDN> createNewSUT() {
        return java.net.IDN.class;
    }

}
