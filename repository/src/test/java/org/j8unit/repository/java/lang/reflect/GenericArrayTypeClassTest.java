package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.GenericArrayType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GenericArrayType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.GenericArrayTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class GenericArrayTypeClassTest
implements GenericArrayTypeClassTests<GenericArrayType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.GenericArrayType]

    @Override
    public Class<GenericArrayType> createNewSUT() {
        return GenericArrayType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.GenericArrayType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.GenericArrayType]

}
