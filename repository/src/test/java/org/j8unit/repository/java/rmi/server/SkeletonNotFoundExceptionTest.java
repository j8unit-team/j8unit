package org.j8unit.repository.java.rmi.server;

import java.rmi.server.SkeletonNotFoundException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SkeletonNotFoundException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.SkeletonNotFoundExceptionTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class SkeletonNotFoundExceptionTest
implements SkeletonNotFoundExceptionTests<SkeletonNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.SkeletonNotFoundException]

    @Override
    public SkeletonNotFoundException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.SkeletonNotFoundException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.SkeletonNotFoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.SkeletonNotFoundException]

}
