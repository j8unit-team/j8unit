package org.j8unit.repository.java.security;

import java.security.PrivilegedAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PrivilegedActionClassTest
implements org.j8unit.repository.java.security.PrivilegedActionClassTests<PrivilegedAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PrivilegedAction]

    @Override
    public Class<PrivilegedAction> createNewSUT() {
        return PrivilegedAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.PrivilegedAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PrivilegedAction]

}
