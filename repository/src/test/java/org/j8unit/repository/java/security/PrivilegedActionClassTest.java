package org.j8unit.repository.java.security;

import java.security.PrivilegedAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrivilegedAction} (by simply reusing the
 * J8Unit test interface {@link PrivilegedActionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PrivilegedActionClassTest
implements PrivilegedActionClassTests<PrivilegedAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PrivilegedAction]

    @Override
    public Class<PrivilegedAction> createNewSUT() {
        return PrivilegedAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.PrivilegedAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PrivilegedAction]

}
