package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteRef;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteRefClassTest
implements org.j8unit.repository.java.rmi.server.RemoteRefClassTests<RemoteRef> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteRef]

    @Override
    public Class<RemoteRef> createNewSUT() {
        return RemoteRef.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteRef]

}
