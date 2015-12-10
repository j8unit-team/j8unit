package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConstructorTest<T>
implements org.j8unit.repository.java.lang.reflect.ConstructorTests<java.lang.reflect.Constructor<T>, T> {

    @Override
    public java.lang.reflect.Constructor<T> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.reflect.Constructor] available.");
    }

}
