package org.j8unit.repository.java.net;

import java.net.FileNameMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileNameMap} (by simply reusing the
 * J8Unit test interface {@link FileNameMapTests}).
 */

@RunWith(J8Unit4.class)
public class FileNameMapTest
implements FileNameMapTests<FileNameMap> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.FileNameMap]

    @Override
    public FileNameMap createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.FileNameMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.FileNameMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.FileNameMap]

}
