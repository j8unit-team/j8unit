package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WatchService} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.WatchServiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class WatchServiceClassTest
implements WatchServiceClassTests<WatchService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.WatchService]

    @Override
    public Class<WatchService> createNewSUT() {
        return WatchService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.WatchService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.WatchService]

}
