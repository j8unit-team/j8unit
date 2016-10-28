package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynFixedOperations;

@RunWith(J8Unit4.class)
public class DynFixedOperationsClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynFixedOperationsClassTests<DynFixedOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynFixedOperations]

    @Override
    public Class<DynFixedOperations> createNewSUT() {
        return DynFixedOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynFixedOperations]

}
