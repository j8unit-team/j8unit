package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GenericArrayTypeClassTest
implements org.j8unit.repository.java.lang.reflect.GenericArrayTypeClassTests<java.lang.reflect.GenericArrayType> {

    @Override
    public Class<java.lang.reflect.GenericArrayType> createNewSUT() {
        return java.lang.reflect.GenericArrayType.class;
    }

}
