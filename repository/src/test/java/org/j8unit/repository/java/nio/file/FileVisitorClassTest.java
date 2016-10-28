package org.j8unit.repository.java.nio.file;

import java.nio.file.FileVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class FileVisitorClassTest
implements org.j8unit.repository.java.nio.file.FileVisitorClassTests<FileVisitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.FileVisitor]

    @Override
    public Class<FileVisitor> createNewSUT() {
        return FileVisitor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.FileVisitor]

}
