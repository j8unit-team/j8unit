package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteCall;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteCallTest
implements org.j8unit.repository.java.rmi.server.RemoteCallTests<RemoteCall> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RemoteCall]

    @Override
    public RemoteCall createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RemoteCall], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RemoteCall]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RemoteCall]

}
