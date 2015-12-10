package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileOutputStreamClassTest
implements org.j8unit.repository.java.io.FileOutputStreamClassTests<java.io.FileOutputStream> {

    @Override
    public Class<java.io.FileOutputStream> createNewSUT() {
        return java.io.FileOutputStream.class;
    }

}
