package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SkeletonNotFoundExceptionTest
implements org.j8unit.repository.java.rmi.server.SkeletonNotFoundExceptionTests<java.rmi.server.SkeletonNotFoundException> {

    @Override
    public java.rmi.server.SkeletonNotFoundException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.server.SkeletonNotFoundException] available.");
    }

}
