package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.AnnotationValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotationValue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.AnnotationValueClassTests}).
 */
@RunWith(J8Unit4.class)
public class AnnotationValueClassTest
implements AnnotationValueClassTests<AnnotationValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.AnnotationValue]

    @Override
    public Class<AnnotationValue> createNewSUT() {
        return AnnotationValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.AnnotationValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.AnnotationValue]

}
