package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Array;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayTest
implements org.j8unit.repository.java.lang.reflect.ArrayTests<Array> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Array]

    @Override
    public Array createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.Array], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Array]

}
