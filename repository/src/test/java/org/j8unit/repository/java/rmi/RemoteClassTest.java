package org.j8unit.repository.java.rmi;

import java.rmi.Remote;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteClassTest
implements org.j8unit.repository.java.rmi.RemoteClassTests<Remote> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.Remote]

    @Override
    public Class<Remote> createNewSUT() {
        return Remote.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.Remote]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.Remote]

}
