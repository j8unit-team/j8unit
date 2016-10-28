package org.j8unit.repository.java.net;

import java.net.SocketPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketPermissionTest
implements org.j8unit.repository.java.net.SocketPermissionTests<SocketPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketPermission]

    @Override
    public SocketPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.SocketPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketPermission]

}
