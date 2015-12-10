package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedInputStreamClassTest
implements org.j8unit.repository.java.io.BufferedInputStreamClassTests<java.io.BufferedInputStream> {

    @Override
    public Class<java.io.BufferedInputStream> createNewSUT() {
        return java.io.BufferedInputStream.class;
    }

}
