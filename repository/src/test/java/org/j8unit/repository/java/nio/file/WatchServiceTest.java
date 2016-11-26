package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WatchService} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.WatchServiceTests}).
 */
@RunWith(J8Unit4.class)
public class WatchServiceTest
implements WatchServiceTests<WatchService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.WatchService]

    @Override
    public WatchService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.WatchService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.WatchService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.WatchService]

}
