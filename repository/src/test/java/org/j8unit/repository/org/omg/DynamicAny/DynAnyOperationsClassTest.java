package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyOperations;

@RunWith(J8Unit4.class)
public class DynAnyOperationsClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyOperationsClassTests<DynAnyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynAnyOperations]

    @Override
    public Class<DynAnyOperations> createNewSUT() {
        return DynAnyOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynAnyOperations]

}
