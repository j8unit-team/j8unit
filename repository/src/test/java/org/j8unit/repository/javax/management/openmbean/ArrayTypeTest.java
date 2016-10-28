package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.ArrayType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayTypeTest<T>
implements org.j8unit.repository.javax.management.openmbean.ArrayTypeTests<ArrayType<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.ArrayType]

    @Override
    public ArrayType<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.openmbean.ArrayType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.ArrayType]

}
