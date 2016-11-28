package org.j8unit.repository.java.security;

import java.security.PrivilegedAction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrivilegedAction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.PrivilegedActionTests}).
 */
@RunWith(J8Unit4.class)
public class PrivilegedActionTest<T>
implements PrivilegedActionTests<PrivilegedAction<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PrivilegedAction]

    @Override
    public PrivilegedAction<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.PrivilegedAction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.PrivilegedAction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.PrivilegedAction]

}
