package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferClassTest
implements org.j8unit.repository.java.nio.BufferClassTests<java.nio.Buffer> {

    @Override
    public Class<java.nio.Buffer> createNewSUT() {
        return java.nio.Buffer.class;
    }

}
