package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SkeletonMismatchExceptionClassTest
implements org.j8unit.repository.java.rmi.server.SkeletonMismatchExceptionClassTests<java.rmi.server.SkeletonMismatchException> {

    @Override
    public Class<java.rmi.server.SkeletonMismatchException> createNewSUT() {
        return java.rmi.server.SkeletonMismatchException.class;
    }

}
