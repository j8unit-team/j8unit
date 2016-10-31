package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.ParameterizedType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterizedTypeClassTest
implements org.j8unit.repository.java.lang.reflect.ParameterizedTypeClassTests<ParameterizedType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.ParameterizedType]

    @Override
    public Class<ParameterizedType> createNewSUT() {
        return ParameterizedType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.ParameterizedType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.ParameterizedType]

}
