package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndeclaredThrowableExceptionTest
implements org.j8unit.repository.java.lang.reflect.UndeclaredThrowableExceptionTests<java.lang.reflect.UndeclaredThrowableException> {

    @Override
    public java.lang.reflect.UndeclaredThrowableException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.reflect.UndeclaredThrowableException] available.");
    }

}
