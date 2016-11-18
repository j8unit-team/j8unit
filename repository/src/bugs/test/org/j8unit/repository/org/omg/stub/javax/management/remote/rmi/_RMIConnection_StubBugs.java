package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import java.util.HashSet;
import java.util.Set;
import javax.rmi.CORBA.Stub;
import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub;

public class _RMIConnection_StubBugs {

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashCodeThrowsAnException() {
        final Stub instance = new _RMIConnection_Stub();
        instance.hashCode();
    }

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashSetAddCrashes() {
        final Set<Stub> set = new HashSet<>();
        final Stub instance = new _RMIConnection_Stub();
        set.add(instance);
    }

}
