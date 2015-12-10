package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataInputStreamClassTest
implements org.j8unit.repository.java.io.DataInputStreamClassTests<java.io.DataInputStream> {

    @Override
    public Class<java.io.DataInputStream> createNewSUT() {
        return java.io.DataInputStream.class;
    }

}
