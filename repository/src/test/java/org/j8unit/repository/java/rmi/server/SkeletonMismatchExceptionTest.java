package org.j8unit.repository.java.rmi.server;

import java.rmi.server.SkeletonMismatchException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SkeletonMismatchException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.SkeletonMismatchExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class SkeletonMismatchExceptionTest
implements SkeletonMismatchExceptionTests<SkeletonMismatchException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

    @Override
    public SkeletonMismatchException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.SkeletonMismatchException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

}
