package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicFileAttributesClassTest
implements org.j8unit.repository.java.nio.file.attribute.BasicFileAttributesClassTests<java.nio.file.attribute.BasicFileAttributes> {

    @Override
    public Class<java.nio.file.attribute.BasicFileAttributes> createNewSUT() {
        return java.nio.file.attribute.BasicFileAttributes.class;
    }

}
