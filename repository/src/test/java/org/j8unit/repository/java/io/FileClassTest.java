package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileClassTest
implements org.j8unit.repository.java.io.FileClassTests<java.io.File> {

    @Override
    public Class<java.io.File> createNewSUT() {
        return java.io.File.class;
    }

}