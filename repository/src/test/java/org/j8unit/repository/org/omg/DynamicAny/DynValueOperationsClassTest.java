package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValueOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynValueOperations} (by simply reusing
 * the J8Unit test interface {@link DynValueOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynValueOperationsClassTest
implements DynValueOperationsClassTests<DynValueOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValueOperations]

    @Override
    public Class<DynValueOperations> createNewSUT() {
        return DynValueOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynValueOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValueOperations]

}
