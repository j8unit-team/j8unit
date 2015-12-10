package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SimpleFileVisitorClassTest
implements org.j8unit.repository.java.nio.file.SimpleFileVisitorClassTests<java.nio.file.SimpleFileVisitor> {

    @Override
    public Class<java.nio.file.SimpleFileVisitor> createNewSUT() {
        return java.nio.file.SimpleFileVisitor.class;
    }

}
