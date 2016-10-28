package org.j8unit.repository.java.nio.file.spi;

import java.nio.file.spi.FileSystemProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemProviderTest
implements org.j8unit.repository.java.nio.file.spi.FileSystemProviderTests<FileSystemProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.spi.FileSystemProvider]

    @Override
    public FileSystemProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.spi.FileSystemProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.spi.FileSystemProvider]

}
