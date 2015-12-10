package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConstructorClassTest
implements org.j8unit.repository.java.lang.reflect.ConstructorClassTests<java.lang.reflect.Constructor> {

    @Override
    public Class<java.lang.reflect.Constructor> createNewSUT() {
        return java.lang.reflect.Constructor.class;
    }

}
