package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterizedTypeClassTest
implements org.j8unit.repository.java.lang.reflect.ParameterizedTypeClassTests<java.lang.reflect.ParameterizedType> {

    @Override
    public Class<java.lang.reflect.ParameterizedType> createNewSUT() {
        return java.lang.reflect.ParameterizedType.class;
    }

}
