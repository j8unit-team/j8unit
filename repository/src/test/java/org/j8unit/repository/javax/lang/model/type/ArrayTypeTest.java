package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ArrayType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayTypeTest
implements org.j8unit.repository.javax.lang.model.type.ArrayTypeTests<ArrayType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.ArrayType]

    @Override
    public ArrayType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.ArrayType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.ArrayType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.ArrayType]

}
