package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileNotFoundExceptionClassTest
implements org.j8unit.repository.java.io.FileNotFoundExceptionClassTests<java.io.FileNotFoundException> {

    @Override
    public Class<java.io.FileNotFoundException> createNewSUT() {
        return java.io.FileNotFoundException.class;
    }

}
