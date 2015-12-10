package org.j8unit.repository.java.lang.invoke;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongMethodTypeExceptionClassTest
implements org.j8unit.repository.java.lang.invoke.WrongMethodTypeExceptionClassTests<java.lang.invoke.WrongMethodTypeException> {

    @Override
    public Class<java.lang.invoke.WrongMethodTypeException> createNewSUT() {
        return java.lang.invoke.WrongMethodTypeException.class;
    }

}
