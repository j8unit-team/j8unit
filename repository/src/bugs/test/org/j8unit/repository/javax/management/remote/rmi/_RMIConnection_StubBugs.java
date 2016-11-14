package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi._RMIConnection_Stub;
import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;

public class _RMIConnection_StubBugs {

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashCodeThrowsAnException() {
        final _RMIConnection_Stub instance = new _RMIConnection_Stub();
        instance.hashCode();
    }

}
