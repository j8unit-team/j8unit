package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayClassTest
implements org.j8unit.repository.java.lang.reflect.ArrayClassTests<java.lang.reflect.Array> {

    @Override
    public Class<java.lang.reflect.Array> createNewSUT() {
        return java.lang.reflect.Array.class;
    }

}
