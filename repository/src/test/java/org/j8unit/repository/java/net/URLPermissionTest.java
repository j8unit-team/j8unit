package org.j8unit.repository.java.net;

import java.net.URLPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link URLPermission} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.URLPermissionTests}).
 */
@RunWith(J8Unit4.class)
public class URLPermissionTest
implements URLPermissionTests<URLPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLPermission]

    @Override
    public URLPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URLPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.URLPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.URLPermission]

}
