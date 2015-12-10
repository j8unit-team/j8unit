package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryNotEmptyExceptionClassTest
implements org.j8unit.repository.java.nio.file.DirectoryNotEmptyExceptionClassTests<java.nio.file.DirectoryNotEmptyException> {

    @Override
    public Class<java.nio.file.DirectoryNotEmptyException> createNewSUT() {
        return java.nio.file.DirectoryNotEmptyException.class;
    }

}
