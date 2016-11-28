package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedArrayType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotatedArrayType} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.AnnotatedArrayTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class AnnotatedArrayTypeClassTest
implements AnnotatedArrayTypeClassTests<AnnotatedArrayType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedArrayType]

    @Override
    public Class<AnnotatedArrayType> createNewSUT() {
        return AnnotatedArrayType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.AnnotatedArrayType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedArrayType]

}
