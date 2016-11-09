package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynSequenceOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynSequenceOperations} (by simply reusing
 * the J8Unit test interface {@link DynSequenceOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynSequenceOperationsClassTest
implements DynSequenceOperationsClassTests<DynSequenceOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynSequenceOperations]

    @Override
    public Class<DynSequenceOperations> createNewSUT() {
        return DynSequenceOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynSequenceOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynSequenceOperations]

}
