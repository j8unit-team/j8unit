package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynArrayOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynArrayOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynArrayOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynArrayOperationsClassTest
implements DynArrayOperationsClassTests<DynArrayOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynArrayOperations]

    @Override
    public Class<DynArrayOperations> createNewSUT() {
        return DynArrayOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynArrayOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynArrayOperations]

}
