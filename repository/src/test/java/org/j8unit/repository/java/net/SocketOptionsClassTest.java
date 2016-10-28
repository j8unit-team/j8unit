package org.j8unit.repository.java.net;

import java.net.SocketOptions;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketOptionsClassTest
implements org.j8unit.repository.java.net.SocketOptionsClassTests<SocketOptions> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.SocketOptions]

    @Override
    public Class<SocketOptions> createNewSUT() {
        return SocketOptions.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.SocketOptions]

}
