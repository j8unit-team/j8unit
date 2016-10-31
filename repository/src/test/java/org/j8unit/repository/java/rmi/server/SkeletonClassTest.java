package org.j8unit.repository.java.rmi.server;

import java.rmi.server.Skeleton;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SkeletonClassTest
implements org.j8unit.repository.java.rmi.server.SkeletonClassTests<Skeleton> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.Skeleton]

    @Override
    public Class<Skeleton> createNewSUT() {
        return Skeleton.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.Skeleton]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.Skeleton]

}
