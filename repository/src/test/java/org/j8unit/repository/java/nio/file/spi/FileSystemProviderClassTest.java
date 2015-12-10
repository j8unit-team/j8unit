package org.j8unit.repository.java.nio.file.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemProviderClassTest
implements org.j8unit.repository.java.nio.file.spi.FileSystemProviderClassTests<java.nio.file.spi.FileSystemProvider> {

    @Override
    public Class<java.nio.file.spi.FileSystemProvider> createNewSUT() {
        return java.nio.file.spi.FileSystemProvider.class;
    }

}
