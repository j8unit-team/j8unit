package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.TypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class TypeVariableClassTest
implements org.j8unit.repository.java.lang.reflect.TypeVariableClassTests<TypeVariable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.TypeVariable]

    @Override
    public Class<TypeVariable> createNewSUT() {
        return TypeVariable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.TypeVariable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.TypeVariable]

}
