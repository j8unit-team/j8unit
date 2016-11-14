package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedParameterizedType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotatedParameterizedType} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.reflect.AnnotatedParameterizedTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class AnnotatedParameterizedTypeClassTest
implements AnnotatedParameterizedTypeClassTests<AnnotatedParameterizedType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedParameterizedType]

    @Override
    public Class<AnnotatedParameterizedType> createNewSUT() {
        return AnnotatedParameterizedType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.AnnotatedParameterizedType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedParameterizedType]

}
