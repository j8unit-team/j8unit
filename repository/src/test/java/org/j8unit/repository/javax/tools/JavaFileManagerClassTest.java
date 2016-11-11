package org.j8unit.repository.javax.tools;

import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JavaFileManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.tools.JavaFileManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class JavaFileManagerClassTest
implements JavaFileManagerClassTests<JavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaFileManager]

    @Override
    public Class<JavaFileManager> createNewSUT() {
        return JavaFileManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.JavaFileManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaFileManager]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Location} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.tools.JavaFileManagerClassTests.LocationClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LocationClassTest
    implements LocationClassTests<Location> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaFileManager$Location]

        @Override
        public Class<Location> createNewSUT() {
            return Location.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.JavaFileManager$Location]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaFileManager$Location]

    }

}
