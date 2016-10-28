package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteCall;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteCallClassTest
implements org.j8unit.repository.java.rmi.server.RemoteCallClassTests<RemoteCall> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteCall]

    @Override
    public Class<RemoteCall> createNewSUT() {
        return RemoteCall.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteCall]

}
