package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynStructOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynStructOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynStructOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynStructOperationsClassTest
implements DynStructOperationsClassTests<DynStructOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynStructOperations]

    @Override
    public Class<DynStructOperations> createNewSUT() {
        return DynStructOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynStructOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynStructOperations]

}
