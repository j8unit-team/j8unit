package org.j8unit.repository.javax.tools;

import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JavaFileManagerClassTest
implements org.j8unit.repository.javax.tools.JavaFileManagerClassTests<JavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaFileManager]

    @Override
    public Class<JavaFileManager> createNewSUT() {
        return JavaFileManager.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaFileManager]

    @RunWith(J8Unit4.class)
    public static class LocationClassTest
    implements org.j8unit.repository.javax.tools.JavaFileManagerClassTests.LocationClassTests<Location> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaFileManager$Location]

        @Override
        public Class<Location> createNewSUT() {
            return Location.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaFileManager$Location]

    }

}
