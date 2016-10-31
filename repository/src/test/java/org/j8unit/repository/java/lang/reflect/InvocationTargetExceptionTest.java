package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.InvocationTargetException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvocationTargetExceptionTest
implements org.j8unit.repository.java.lang.reflect.InvocationTargetExceptionTests<InvocationTargetException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.InvocationTargetException]

    @Override
    public InvocationTargetException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.InvocationTargetException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.InvocationTargetException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.InvocationTargetException]

}
