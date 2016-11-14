package org.j8unit.repository.javax.tools;

import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JavaFileManager} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.tools.JavaFileManagerTests}).
 */

@RunWith(J8Unit4.class)
public class JavaFileManagerTest
implements JavaFileManagerTests<JavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaFileManager]

    @Override
    public JavaFileManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.JavaFileManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaFileManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaFileManager]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Location} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.tools.JavaFileManagerTests.LocationTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LocationTest
    implements LocationTests<Location> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaFileManager$Location]

        @Override
        public Location createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.JavaFileManager.Location], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaFileManager$Location]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaFileManager$Location]

    }

}
