package org.j8unit.repository.java.io;

import java.io.FilePermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FilePermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.io.FilePermissionTests}).
 */

@RunWith(J8Unit4.class)
public class FilePermissionTest
implements FilePermissionTests<FilePermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FilePermission]

    @Override
    public FilePermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.FilePermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.FilePermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.FilePermission]

}
