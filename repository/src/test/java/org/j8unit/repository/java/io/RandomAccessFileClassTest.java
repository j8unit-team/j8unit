package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RandomAccessFileClassTest
implements org.j8unit.repository.java.io.RandomAccessFileClassTests<java.io.RandomAccessFile> {

    @Override
    public Class<java.io.RandomAccessFile> createNewSUT() {
        return java.io.RandomAccessFile.class;
    }

}
