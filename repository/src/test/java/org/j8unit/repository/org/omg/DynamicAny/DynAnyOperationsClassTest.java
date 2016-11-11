package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynAnyOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynAnyOperationsClassTest
implements DynAnyOperationsClassTests<DynAnyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynAnyOperations]

    @Override
    public Class<DynAnyOperations> createNewSUT() {
        return DynAnyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynAnyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynAnyOperations]

}
