package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileNotFoundExceptionTest
implements org.j8unit.repository.java.io.FileNotFoundExceptionTests<java.io.FileNotFoundException> {

    @Override
    public java.io.FileNotFoundException createNewSUT() {
        return new java.io.FileNotFoundException();
    }

}
