package org.j8unit.repository.java.nio.file.spi;

import java.nio.file.spi.FileTypeDetector;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTypeDetectorTest
implements org.j8unit.repository.java.nio.file.spi.FileTypeDetectorTests<FileTypeDetector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.spi.FileTypeDetector]

    @Override
    public FileTypeDetector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.spi.FileTypeDetector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.spi.FileTypeDetector]

}
