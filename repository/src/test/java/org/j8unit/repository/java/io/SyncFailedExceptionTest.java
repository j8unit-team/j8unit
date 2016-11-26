package org.j8unit.repository.java.io;

import java.io.SyncFailedException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SyncFailedException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.io.SyncFailedExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class SyncFailedExceptionTest
implements SyncFailedExceptionTests<SyncFailedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.SyncFailedException]

    @Override
    public SyncFailedException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.SyncFailedException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.SyncFailedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.SyncFailedException]

}
