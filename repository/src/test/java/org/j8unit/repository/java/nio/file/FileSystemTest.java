package org.j8unit.repository.java.nio.file;

import java.nio.file.FileSystem;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileSystem} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.FileSystemTests}).
 */
@RunWith(J8Unit4.class)
public class FileSystemTest
implements FileSystemTests<FileSystem> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystem]

    @Override
    public FileSystem createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.FileSystem], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.FileSystem]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.FileSystem]

}
