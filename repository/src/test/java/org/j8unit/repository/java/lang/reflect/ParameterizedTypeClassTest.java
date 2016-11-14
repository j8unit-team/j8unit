package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.ParameterizedType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParameterizedType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.ParameterizedTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class ParameterizedTypeClassTest
implements ParameterizedTypeClassTests<ParameterizedType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.ParameterizedType]

    @Override
    public Class<ParameterizedType> createNewSUT() {
        return ParameterizedType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.ParameterizedType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.ParameterizedType]

}
