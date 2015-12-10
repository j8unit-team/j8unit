package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SkeletonMismatchExceptionTest
implements org.j8unit.repository.java.rmi.server.SkeletonMismatchExceptionTests<java.rmi.server.SkeletonMismatchException> {

    @Override
    public java.rmi.server.SkeletonMismatchException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.server.SkeletonMismatchException] available.");
    }

}
