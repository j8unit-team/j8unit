package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JavaFileManagerClassTest
implements org.j8unit.repository.javax.tools.JavaFileManagerClassTests<javax.tools.JavaFileManager> {

    @RunWith(J8Unit4.class)
    public static class LocationClassTest
    implements org.j8unit.repository.javax.tools.JavaFileManagerClassTests.LocationClassTests<javax.tools.JavaFileManager.Location> {

        @Override
        public Class<javax.tools.JavaFileManager.Location> createNewSUT() {
            return javax.tools.JavaFileManager.Location.class;
        }

    }

    @Override
    public Class<javax.tools.JavaFileManager> createNewSUT() {
        return javax.tools.JavaFileManager.class;
    }

}
