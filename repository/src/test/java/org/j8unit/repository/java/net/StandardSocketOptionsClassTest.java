package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardSocketOptionsClassTest
implements org.j8unit.repository.java.net.StandardSocketOptionsClassTests<java.net.StandardSocketOptions> {

    @Override
    public Class<java.net.StandardSocketOptions> createNewSUT() {
        return java.net.StandardSocketOptions.class;
    }

}
