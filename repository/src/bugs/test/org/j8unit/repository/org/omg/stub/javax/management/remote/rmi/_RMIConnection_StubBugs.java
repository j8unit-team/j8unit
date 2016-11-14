package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub;

public class _RMIConnection_StubBugs {

    @Test(expected = BAD_OPERATION.class)
    public void hashCodeThrowsAnException() {
        final _RMIConnection_StubTests<_RMIConnection_Stub> rcs = _RMIConnection_Stub::new;
        rcs.hashCodeMustBeConsistent();
    }

}
