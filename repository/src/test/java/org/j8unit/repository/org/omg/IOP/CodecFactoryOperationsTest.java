package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecFactoryOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CodecFactoryOperations} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.CodecFactoryOperationsTests}).
 */

@RunWith(J8Unit4.class)
public class CodecFactoryOperationsTest
implements CodecFactoryOperationsTests<CodecFactoryOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodecFactoryOperations]

    @Override
    public CodecFactoryOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.CodecFactoryOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodecFactoryOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodecFactoryOperations]

}
