package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynUnion;

@RunWith(J8Unit4.class)
public class DynUnionClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynUnionClassTests<DynUnion> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynUnion]

    @Override
    public Class<DynUnion> createNewSUT() {
        return DynUnion.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynUnion]

}
