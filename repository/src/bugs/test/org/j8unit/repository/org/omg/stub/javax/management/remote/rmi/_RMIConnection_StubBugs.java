package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import java.util.HashSet;
import java.util.Set;
import javax.management.remote.rmi.RMIConnection;
import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub;

@SuppressWarnings("restriction")
public class _RMIConnection_StubBugs {

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashCodeThrowsAnException()
    throws Exception {
        try (final RMIConnection instance = new _RMIConnection_Stub()) {
            instance.hashCode();
        }
    }

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashSetAddCrashes()
    throws Exception {
        try (final RMIConnection instance = new _RMIConnection_Stub()) {
            final Set<RMIConnection> set = new HashSet<>();
            set.add(instance);
        }
    }

}
