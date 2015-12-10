package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PushbackInputStreamClassTest
implements org.j8unit.repository.java.io.PushbackInputStreamClassTests<java.io.PushbackInputStream> {

    @Override
    public Class<java.io.PushbackInputStream> createNewSUT() {
        return java.io.PushbackInputStream.class;
    }

}
