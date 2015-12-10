package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvocationTargetExceptionTest
implements org.j8unit.repository.java.lang.reflect.InvocationTargetExceptionTests<java.lang.reflect.InvocationTargetException> {

    @Override
    public java.lang.reflect.InvocationTargetException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.reflect.InvocationTargetException] available.");
    }

}
