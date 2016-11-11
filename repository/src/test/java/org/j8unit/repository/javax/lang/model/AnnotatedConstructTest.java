package org.j8unit.repository.javax.lang.model;

import javax.lang.model.AnnotatedConstruct;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AnnotatedConstruct} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.AnnotatedConstructTests}).
 */

@RunWith(J8Unit4.class)
public class AnnotatedConstructTest
implements AnnotatedConstructTests<AnnotatedConstruct> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.AnnotatedConstruct]

    @Override
    public AnnotatedConstruct createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.AnnotatedConstruct], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.AnnotatedConstruct]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.AnnotatedConstruct]

}
