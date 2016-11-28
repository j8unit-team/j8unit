package org.j8unit.repository.org.omg.stub.java.rmi;

import java.rmi.Remote;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.stub.java.rmi._Remote_Stub;

/**
 * @since 0.9.7
 */
public class _Remote_StubBugs {

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashCodeThrowsAnException() {
        final Remote instance = new _Remote_Stub();
        instance.hashCode();
    }

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashSetAddCrashes() {
        final Set<Remote> set = new HashSet<>();
        final Remote instance = new _Remote_Stub();
        set.add(instance);
    }

}
