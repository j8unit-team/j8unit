package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTimeClassTest
implements org.j8unit.repository.java.nio.file.attribute.FileTimeClassTests<java.nio.file.attribute.FileTime> {

    @Override
    public Class<java.nio.file.attribute.FileTime> createNewSUT() {
        return java.nio.file.attribute.FileTime.class;
    }

}
