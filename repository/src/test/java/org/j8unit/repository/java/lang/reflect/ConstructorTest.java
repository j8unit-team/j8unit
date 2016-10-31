package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Constructor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConstructorTest<T>
implements org.j8unit.repository.java.lang.reflect.ConstructorTests<Constructor<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Constructor]

    @Override
    public Constructor<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.Constructor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.Constructor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.Constructor]

}
