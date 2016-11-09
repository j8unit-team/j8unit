package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynUnionOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynUnionOperations} (by simply reusing
 * the J8Unit test interface {@link DynUnionOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynUnionOperationsClassTest
implements DynUnionOperationsClassTests<DynUnionOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynUnionOperations]

    @Override
    public Class<DynUnionOperations> createNewSUT() {
        return DynUnionOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynUnionOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynUnionOperations]

}
