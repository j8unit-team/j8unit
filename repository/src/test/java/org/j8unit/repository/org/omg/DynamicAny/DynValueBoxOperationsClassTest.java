package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValueBoxOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynValueBoxOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynValueBoxOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynValueBoxOperationsClassTest
implements DynValueBoxOperationsClassTests<DynValueBoxOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValueBoxOperations]

    @Override
    public Class<DynValueBoxOperations> createNewSUT() {
        return DynValueBoxOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynValueBoxOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValueBoxOperations]

}
