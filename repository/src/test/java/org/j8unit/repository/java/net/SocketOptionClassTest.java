package org.j8unit.repository.java.net;

import java.net.SocketOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SocketOptionClassTest
implements org.j8unit.repository.java.net.SocketOptionClassTests<SocketOption> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.SocketOption]

    @Override
    public Class<SocketOption> createNewSUT() {
        return SocketOption.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.SocketOption]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.SocketOption]

}
