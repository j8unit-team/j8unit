package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilesClassTest
implements org.j8unit.repository.java.nio.file.FilesClassTests<java.nio.file.Files> {

    @Override
    public Class<java.nio.file.Files> createNewSUT() {
        return java.nio.file.Files.class;
    }

}
