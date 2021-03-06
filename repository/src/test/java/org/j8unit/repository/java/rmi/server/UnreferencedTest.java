package org.j8unit.repository.java.rmi.server;

import java.rmi.server.Unreferenced;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Unreferenced} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.UnreferencedTests}).
 */
@RunWith(J8Unit4.class)
public class UnreferencedTest
implements UnreferencedTests<Unreferenced> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.Unreferenced]

    @Override
    public Unreferenced createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.Unreferenced], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.Unreferenced]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.Unreferenced]

}
