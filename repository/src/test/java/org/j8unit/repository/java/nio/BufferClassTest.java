package org.j8unit.repository.java.nio;

import java.nio.Buffer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Buffer} (by simply reusing the J8Unit
 * test interface {@link BufferClassTests}).
 */

@RunWith(J8Unit4.class)
public class BufferClassTest
implements BufferClassTests<Buffer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.Buffer]

    @Override
    public Class<Buffer> createNewSUT() {
        return Buffer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.Buffer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.Buffer]

}
