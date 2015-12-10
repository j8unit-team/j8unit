package org.j8unit.repository.javax.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortableRemoteObjectClassTest
implements org.j8unit.repository.javax.rmi.PortableRemoteObjectClassTests<javax.rmi.PortableRemoteObject> {

    @Override
    public Class<javax.rmi.PortableRemoteObject> createNewSUT() {
        return javax.rmi.PortableRemoteObject.class;
    }

}
