package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedWildcardType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotatedWildcardType} (by simply reusing
 * the J8Unit test interface {@link AnnotatedWildcardTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class AnnotatedWildcardTypeClassTest
implements AnnotatedWildcardTypeClassTests<AnnotatedWildcardType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedWildcardType]

    @Override
    public Class<AnnotatedWildcardType> createNewSUT() {
        return AnnotatedWildcardType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.AnnotatedWildcardType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedWildcardType]

}
