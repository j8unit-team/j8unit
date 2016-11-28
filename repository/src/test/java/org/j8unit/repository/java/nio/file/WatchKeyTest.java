package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WatchKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.WatchKeyTests}).
 */
@RunWith(J8Unit4.class)
public class WatchKeyTest
implements WatchKeyTests<WatchKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchKey]

    @Override
    public WatchKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.WatchKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.WatchKey]

}
