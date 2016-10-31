package org.j8unit.repository.javax.tools;

import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JavaFileManagerTest
implements org.j8unit.repository.javax.tools.JavaFileManagerTests<JavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaFileManager]

    @Override
    public JavaFileManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.JavaFileManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaFileManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaFileManager]

    @RunWith(J8Unit4.class)
    public static class LocationTest
    implements org.j8unit.repository.javax.tools.JavaFileManagerTests.LocationTests<Location> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaFileManager$Location]

        @Override
        public Location createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.JavaFileManager.Location], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaFileManager$Location]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaFileManager$Location]

    }

}
