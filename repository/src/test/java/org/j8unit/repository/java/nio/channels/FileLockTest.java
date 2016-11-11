package org.j8unit.repository.java.nio.channels;

import java.nio.channels.FileLock;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileLock} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.FileLockTests}).
 */

@RunWith(J8Unit4.class)
public class FileLockTest
implements FileLockTests<FileLock> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.FileLock]

    @Override
    public FileLock createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.FileLock], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.FileLock]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.FileLock]

}
