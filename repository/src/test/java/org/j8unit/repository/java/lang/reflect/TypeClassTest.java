package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeClassTest
implements org.j8unit.repository.java.lang.reflect.TypeClassTests<java.lang.reflect.Type> {

    @Override
    public Class<java.lang.reflect.Type> createNewSUT() {
        return java.lang.reflect.Type.class;
    }

}
