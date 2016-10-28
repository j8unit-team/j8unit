package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeClassTest
implements org.j8unit.repository.java.lang.reflect.TypeClassTests<Type> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Type]

    @Override
    public Class<Type> createNewSUT() {
        return Type.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Type]

}
