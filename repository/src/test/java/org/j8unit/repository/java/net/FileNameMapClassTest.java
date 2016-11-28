package org.j8unit.repository.java.net;

import java.net.FileNameMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileNameMap} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.FileNameMapClassTests}).
 */
@RunWith(J8Unit4.class)
public class FileNameMapClassTest
implements FileNameMapClassTests<FileNameMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.FileNameMap]

    @Override
    public Class<FileNameMap> createNewSUT() {
        return FileNameMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.FileNameMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.FileNameMap]

}
