package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynFixedOperationsClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynFixedOperationsClassTests<org.omg.DynamicAny.DynFixedOperations> {

    @Override
    public Class<org.omg.DynamicAny.DynFixedOperations> createNewSUT() {
        return org.omg.DynamicAny.DynFixedOperations.class;
    }

}
