package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class FileVisitorClassTest
implements org.j8unit.repository.java.nio.file.FileVisitorClassTests<java.nio.file.FileVisitor> {

    @Override
    public Class<java.nio.file.FileVisitor> createNewSUT() {
        return java.nio.file.FileVisitor.class;
    }

}
