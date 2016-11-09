package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CodecOperations} (by simply reusing
 * the J8Unit test interface {@link CodecOperationsTests}).
 */

@RunWith(J8Unit4.class)
public class CodecOperationsTest
implements CodecOperationsTests<CodecOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodecOperations]

    @Override
    public CodecOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.CodecOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodecOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodecOperations]

}
