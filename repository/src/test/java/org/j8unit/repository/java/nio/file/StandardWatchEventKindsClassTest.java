package org.j8unit.repository.java.nio.file;

import java.nio.file.StandardWatchEventKinds;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StandardWatchEventKinds} (by simply
 * reusing the J8Unit test interface {@link StandardWatchEventKindsClassTests}).
 */

@RunWith(J8Unit4.class)
public class StandardWatchEventKindsClassTest
implements StandardWatchEventKindsClassTests<StandardWatchEventKinds> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.StandardWatchEventKinds]

    @Override
    public Class<StandardWatchEventKinds> createNewSUT() {
        return StandardWatchEventKinds.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.StandardWatchEventKinds]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.StandardWatchEventKinds]

}
