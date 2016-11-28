package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynFixedOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynFixedOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynFixedOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynFixedOperationsClassTest
implements DynFixedOperationsClassTests<DynFixedOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynFixedOperations]

    @Override
    public Class<DynFixedOperations> createNewSUT() {
        return DynFixedOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynFixedOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynFixedOperations]

}
