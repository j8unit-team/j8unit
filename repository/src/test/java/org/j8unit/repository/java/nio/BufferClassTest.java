package org.j8unit.repository.java.nio;

import java.nio.Buffer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferClassTest
implements org.j8unit.repository.java.nio.BufferClassTests<Buffer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.Buffer]

    @Override
    public Class<Buffer> createNewSUT() {
        return Buffer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.Buffer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.Buffer]

}
