package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotatedElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.AnnotatedElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class AnnotatedElementClassTest
implements AnnotatedElementClassTests<AnnotatedElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedElement]

    @Override
    public Class<AnnotatedElement> createNewSUT() {
        return AnnotatedElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.AnnotatedElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedElement]

}
