package org.j8unit.repository.java.nio.file;

import java.nio.file.FileSystem;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemClassTest
implements org.j8unit.repository.java.nio.file.FileSystemClassTests<FileSystem> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.FileSystem]

    @Override
    public Class<FileSystem> createNewSUT() {
        return FileSystem.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.FileSystem]

}
