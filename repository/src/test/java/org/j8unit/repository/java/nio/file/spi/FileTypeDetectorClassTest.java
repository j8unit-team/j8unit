package org.j8unit.repository.java.nio.file.spi;

import java.nio.file.spi.FileTypeDetector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTypeDetectorClassTest
implements org.j8unit.repository.java.nio.file.spi.FileTypeDetectorClassTests<FileTypeDetector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.spi.FileTypeDetector]

    @Override
    public Class<FileTypeDetector> createNewSUT() {
        return FileTypeDetector.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.spi.FileTypeDetector]

}
