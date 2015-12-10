package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileVisitResultClassTest
implements org.j8unit.repository.java.nio.file.FileVisitResultClassTests<java.nio.file.FileVisitResult> {

    @Override
    public Class<java.nio.file.FileVisitResult> createNewSUT() {
        return java.nio.file.FileVisitResult.class;
    }

}
