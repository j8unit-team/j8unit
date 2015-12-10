package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedOutputStreamClassTest
implements org.j8unit.repository.java.io.BufferedOutputStreamClassTests<java.io.BufferedOutputStream> {

    @Override
    public Class<java.io.BufferedOutputStream> createNewSUT() {
        return java.io.BufferedOutputStream.class;
    }

}
