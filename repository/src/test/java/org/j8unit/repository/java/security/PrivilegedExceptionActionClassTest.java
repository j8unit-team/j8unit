package org.j8unit.repository.java.security;

import java.security.PrivilegedExceptionAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrivilegedExceptionAction} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.PrivilegedExceptionActionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PrivilegedExceptionActionClassTest
implements PrivilegedExceptionActionClassTests<PrivilegedExceptionAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PrivilegedExceptionAction]

    @Override
    public Class<PrivilegedExceptionAction> createNewSUT() {
        return PrivilegedExceptionAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.PrivilegedExceptionAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PrivilegedExceptionAction]

}
