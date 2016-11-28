package org.j8unit.repository.java.rmi.dgc;

import java.rmi.dgc.Lease;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Lease} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.dgc.LeaseTests}).
 */
@RunWith(J8Unit4.class)
public class LeaseTest
implements LeaseTests<Lease> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.dgc.Lease]

    @Override
    public Lease createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.dgc.Lease], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.dgc.Lease]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.dgc.Lease]

}
