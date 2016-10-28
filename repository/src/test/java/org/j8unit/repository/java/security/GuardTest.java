package org.j8unit.repository.java.security;

import java.security.Guard;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GuardTest
implements org.j8unit.repository.java.security.GuardTests<Guard> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Guard]

    @Override
    public Guard createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Guard], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Guard]

}
