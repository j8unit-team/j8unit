package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.AnnotationValueVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotationValueVisitor} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.lang.model.element.AnnotationValueVisitorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AnnotationValueVisitorClassTest
implements AnnotationValueVisitorClassTests<AnnotationValueVisitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.AnnotationValueVisitor]

    @Override
    public Class<AnnotationValueVisitor> createNewSUT() {
        return AnnotationValueVisitor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.AnnotationValueVisitor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.AnnotationValueVisitor]

}
