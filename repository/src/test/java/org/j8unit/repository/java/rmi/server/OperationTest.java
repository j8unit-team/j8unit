package org.j8unit.repository.java.rmi.server;

import java.rmi.server.Operation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Operation} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.OperationTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class OperationTest
implements OperationTests<Operation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.Operation]

    @Override
    public Operation createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.Operation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.Operation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.Operation]

}
