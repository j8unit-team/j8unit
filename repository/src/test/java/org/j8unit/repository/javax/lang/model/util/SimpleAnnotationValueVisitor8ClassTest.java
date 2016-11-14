package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleAnnotationValueVisitor8} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.lang.model.util.SimpleAnnotationValueVisitor8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleAnnotationValueVisitor8ClassTest
implements SimpleAnnotationValueVisitor8ClassTests<SimpleAnnotationValueVisitor8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.SimpleAnnotationValueVisitor8]

    @Override
    public Class<SimpleAnnotationValueVisitor8> createNewSUT() {
        return SimpleAnnotationValueVisitor8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.SimpleAnnotationValueVisitor8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.SimpleAnnotationValueVisitor8]

}
