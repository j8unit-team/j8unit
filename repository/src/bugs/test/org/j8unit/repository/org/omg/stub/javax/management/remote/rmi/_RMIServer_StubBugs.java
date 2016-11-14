package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.stub.javax.management.remote.rmi._RMIServer_Stub;

public class _RMIServer_StubBugs {

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashCodeThrowsAnException() {
        final _RMIServer_Stub instance = new _RMIServer_Stub();
        instance.hashCode();
    }

}
