package org.j8unit.repository.java.nio.file.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTypeDetectorClassTest
implements org.j8unit.repository.java.nio.file.spi.FileTypeDetectorClassTests<java.nio.file.spi.FileTypeDetector> {

    @Override
    public Class<java.nio.file.spi.FileTypeDetector> createNewSUT() {
        return java.nio.file.spi.FileTypeDetector.class;
    }

}
