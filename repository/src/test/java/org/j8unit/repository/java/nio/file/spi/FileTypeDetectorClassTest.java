package org.j8unit.repository.java.nio.file.spi;

import java.nio.file.spi.FileTypeDetector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileTypeDetector} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.spi.FileTypeDetectorClassTests}).
 */
@RunWith(J8Unit4.class)
public class FileTypeDetectorClassTest
implements FileTypeDetectorClassTests<FileTypeDetector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.spi.FileTypeDetector]

    @Override
    public Class<FileTypeDetector> createNewSUT() {
        return FileTypeDetector.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.spi.FileTypeDetector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.spi.FileTypeDetector]

}
