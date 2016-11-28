package org.j8unit.repository.java.rmi.server;

import java.rmi.server.Skeleton;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Skeleton} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.server.SkeletonClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class SkeletonClassTest
implements SkeletonClassTests<Skeleton> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.Skeleton]

    @Override
    public Class<Skeleton> createNewSUT() {
        return Skeleton.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.Skeleton]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.Skeleton]

}
