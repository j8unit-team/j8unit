package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedParametersExceptionClassTest
implements org.j8unit.repository.java.lang.reflect.MalformedParametersExceptionClassTests<java.lang.reflect.MalformedParametersException> {

    @Override
    public Class<java.lang.reflect.MalformedParametersException> createNewSUT() {
        return java.lang.reflect.MalformedParametersException.class;
    }

}