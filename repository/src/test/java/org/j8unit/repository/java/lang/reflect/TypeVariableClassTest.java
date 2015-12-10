package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class TypeVariableClassTest
implements org.j8unit.repository.java.lang.reflect.TypeVariableClassTests<java.lang.reflect.TypeVariable> {

    @Override
    public Class<java.lang.reflect.TypeVariable> createNewSUT() {
        return java.lang.reflect.TypeVariable.class;
    }

}
