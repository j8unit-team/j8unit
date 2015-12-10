package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodClassTest
implements org.j8unit.repository.java.lang.reflect.MethodClassTests<java.lang.reflect.Method> {

    @Override
    public Class<java.lang.reflect.Method> createNewSUT() {
        return java.lang.reflect.Method.class;
    }

}
