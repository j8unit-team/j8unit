package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedTypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotatedTypeVariable} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.AnnotatedTypeVariableClassTests}).
 */
@RunWith(J8Unit4.class)
public class AnnotatedTypeVariableClassTest
implements AnnotatedTypeVariableClassTests<AnnotatedTypeVariable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedTypeVariable]

    @Override
    public Class<AnnotatedTypeVariable> createNewSUT() {
        return AnnotatedTypeVariable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.AnnotatedTypeVariable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedTypeVariable]

}
