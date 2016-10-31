package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynUnion;

@RunWith(J8Unit4.class)
public class DynUnionTest
implements org.j8unit.repository.org.omg.DynamicAny.DynUnionTests<DynUnion> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynUnion]

    @Override
    public DynUnion createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.DynUnion], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynUnion]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynUnion]

}
