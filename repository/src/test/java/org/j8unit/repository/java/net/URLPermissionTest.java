package org.j8unit.repository.java.net;

import java.net.URLPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLPermissionTest
implements org.j8unit.repository.java.net.URLPermissionTests<URLPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLPermission]

    @Override
    public URLPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URLPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLPermission]

}
