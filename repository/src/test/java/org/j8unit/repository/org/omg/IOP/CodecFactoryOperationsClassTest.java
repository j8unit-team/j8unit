package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecFactoryOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CodecFactoryOperations} (by simply
 * reusing the J8Unit test interface {@link CodecFactoryOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class CodecFactoryOperationsClassTest
implements CodecFactoryOperationsClassTests<CodecFactoryOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.CodecFactoryOperations]

    @Override
    public Class<CodecFactoryOperations> createNewSUT() {
        return CodecFactoryOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.CodecFactoryOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.CodecFactoryOperations]

}
