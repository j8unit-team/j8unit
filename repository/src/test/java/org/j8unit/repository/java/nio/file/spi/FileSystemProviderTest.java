package org.j8unit.repository.java.nio.file.spi;

import java.nio.file.spi.FileSystemProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileSystemProvider} (by simply
 * reusing the J8Unit test interface {@link FileSystemProviderTests}).
 */

@RunWith(J8Unit4.class)
public class FileSystemProviderTest
implements FileSystemProviderTests<FileSystemProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.spi.FileSystemProvider]

    @Override
    public FileSystemProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.spi.FileSystemProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.spi.FileSystemProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.spi.FileSystemProvider]

}
