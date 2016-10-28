package org.j8unit.repository.java.security;

import java.security.PrivilegedExceptionAction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivilegedExceptionActionTest<T>
implements org.j8unit.repository.java.security.PrivilegedExceptionActionTests<PrivilegedExceptionAction<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PrivilegedExceptionAction]

    @Override
    public PrivilegedExceptionAction<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.PrivilegedExceptionAction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PrivilegedExceptionAction]

}
