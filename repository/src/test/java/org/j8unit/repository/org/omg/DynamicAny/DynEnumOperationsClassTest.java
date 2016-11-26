package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynEnumOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynEnumOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynEnumOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynEnumOperationsClassTest
implements DynEnumOperationsClassTests<DynEnumOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynEnumOperations]

    @Override
    public Class<DynEnumOperations> createNewSUT() {
        return DynEnumOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynEnumOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynEnumOperations]

}
