package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SkeletonNotFoundExceptionClassTest
implements org.j8unit.repository.java.rmi.server.SkeletonNotFoundExceptionClassTests<java.rmi.server.SkeletonNotFoundException> {

    @Override
    public Class<java.rmi.server.SkeletonNotFoundException> createNewSUT() {
        return java.rmi.server.SkeletonNotFoundException.class;
    }

}
