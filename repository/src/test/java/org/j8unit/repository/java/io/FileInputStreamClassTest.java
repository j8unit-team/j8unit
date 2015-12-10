package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileInputStreamClassTest
implements org.j8unit.repository.java.io.FileInputStreamClassTests<java.io.FileInputStream> {

    @Override
    public Class<java.io.FileInputStream> createNewSUT() {
        return java.io.FileInputStream.class;
    }

}
