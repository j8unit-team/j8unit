package org.j8unit.repository.java.nio.file;

import java.nio.file.SimpleFileVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleFileVisitorClassTest
implements org.j8unit.repository.java.nio.file.SimpleFileVisitorClassTests<SimpleFileVisitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.SimpleFileVisitor]

    @Override
    public Class<SimpleFileVisitor> createNewSUT() {
        return SimpleFileVisitor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.SimpleFileVisitor]

}
