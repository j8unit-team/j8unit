package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileOutputStreamTest
implements org.j8unit.repository.java.io.FileOutputStreamTests<java.io.FileOutputStream> {

    @Override
    public java.io.FileOutputStream createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.io.FileOutputStream] available.");
    }

}
