package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemsClassTest
implements org.j8unit.repository.java.nio.file.FileSystemsClassTests<java.nio.file.FileSystems> {

    @Override
    public Class<java.nio.file.FileSystems> createNewSUT() {
        return java.nio.file.FileSystems.class;
    }

}
