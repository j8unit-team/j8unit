package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortableRemoteObjectDelegateClassTest
implements org.j8unit.repository.javax.rmi.CORBA.PortableRemoteObjectDelegateClassTests<javax.rmi.CORBA.PortableRemoteObjectDelegate> {

    @Override
    public Class<javax.rmi.CORBA.PortableRemoteObjectDelegate> createNewSUT() {
        return javax.rmi.CORBA.PortableRemoteObjectDelegate.class;
    }

}
