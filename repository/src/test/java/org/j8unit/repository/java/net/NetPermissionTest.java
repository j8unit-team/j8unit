package org.j8unit.repository.java.net;

import java.net.NetPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NetPermissionTest
implements org.j8unit.repository.java.net.NetPermissionTests<NetPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.NetPermission]

    @Override
    public NetPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.NetPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.NetPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.NetPermission]

}
