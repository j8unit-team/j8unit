package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemClassTest
implements org.j8unit.repository.java.nio.file.FileSystemClassTests<java.nio.file.FileSystem> {

    @Override
    public Class<java.nio.file.FileSystem> createNewSUT() {
        return java.nio.file.FileSystem.class;
    }

}
