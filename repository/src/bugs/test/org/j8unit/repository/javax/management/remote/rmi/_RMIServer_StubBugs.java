package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi._RMIServer_Stub;
import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;

public class _RMIServer_StubBugs {

    @Test(expected = BAD_OPERATION.class)
    public void hashCodeThrowsAnException() {
        final _RMIServer_StubTests<_RMIServer_Stub> rcs = _RMIServer_Stub::new;
        rcs.hashCodeMustBeConsistent();
    }

}
