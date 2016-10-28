package org.j8unit.repository.java.rmi.server;

import java.rmi.server.SkeletonMismatchException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SkeletonMismatchExceptionTest
implements org.j8unit.repository.java.rmi.server.SkeletonMismatchExceptionTests<SkeletonMismatchException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

    @Override
    public SkeletonMismatchException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.SkeletonMismatchException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

}
