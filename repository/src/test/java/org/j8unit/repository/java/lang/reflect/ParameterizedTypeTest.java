package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.ParameterizedType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterizedTypeTest
implements org.j8unit.repository.java.lang.reflect.ParameterizedTypeTests<ParameterizedType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.ParameterizedType]

    @Override
    public ParameterizedType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.ParameterizedType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.ParameterizedType]

}
