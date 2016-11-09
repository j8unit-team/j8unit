package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractAnnotationValueVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractAnnotationValueVisitor8} (by
 * simply reusing the J8Unit test interface {@link AbstractAnnotationValueVisitor8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractAnnotationValueVisitor8ClassTest
implements AbstractAnnotationValueVisitor8ClassTests<AbstractAnnotationValueVisitor8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.AbstractAnnotationValueVisitor8]

    @Override
    public Class<AbstractAnnotationValueVisitor8> createNewSUT() {
        return AbstractAnnotationValueVisitor8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.AbstractAnnotationValueVisitor8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.AbstractAnnotationValueVisitor8]

}
