package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValueCommonOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynValueCommonOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynValueCommonOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynValueCommonOperationsClassTest
implements DynValueCommonOperationsClassTests<DynValueCommonOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValueCommonOperations]

    @Override
    public Class<DynValueCommonOperations> createNewSUT() {
        return DynValueCommonOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynValueCommonOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValueCommonOperations]

}
