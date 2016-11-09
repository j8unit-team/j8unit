package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CodecOperations} (by simply reusing the
 * J8Unit test interface {@link CodecOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class CodecOperationsClassTest
implements CodecOperationsClassTests<CodecOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.CodecOperations]

    @Override
    public Class<CodecOperations> createNewSUT() {
        return CodecOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.CodecOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.CodecOperations]

}
