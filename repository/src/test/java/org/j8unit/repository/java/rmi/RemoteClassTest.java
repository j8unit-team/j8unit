package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteClassTest
implements org.j8unit.repository.java.rmi.RemoteClassTests<java.rmi.Remote> {

    @Override
    public Class<java.rmi.Remote> createNewSUT() {
        return java.rmi.Remote.class;
    }

}
