package org.j8unit.repository.javax.management.remote.rmi;

import java.util.HashSet;
import java.util.Set;
import javax.management.remote.rmi.RMIServer;
import javax.management.remote.rmi._RMIServer_Stub;
import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;

public class _RMIServer_StubBugs {

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashCodeThrowsAnException() {
        final RMIServer instance = new _RMIServer_Stub();
        instance.hashCode();
    }

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashSetAddCrashes() {
        final Set<RMIServer> set = new HashSet<>();
        final RMIServer instance = new _RMIServer_Stub();
        set.add(instance);
    }

}
