package org.j8unit.repository.java.rmi;

import java.rmi.Remote;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Remote} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.RemoteTests}).
 */
@RunWith(J8Unit4.class)
public class RemoteTest
implements RemoteTests<Remote> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.Remote]

    @Override
    public Remote createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.Remote], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.Remote]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.Remote]

}
