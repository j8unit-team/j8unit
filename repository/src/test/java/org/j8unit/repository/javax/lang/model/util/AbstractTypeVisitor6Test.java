package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractTypeVisitor6;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractTypeVisitor6} (by simply
 * reusing the J8Unit test interface {@link AbstractTypeVisitor6Tests}).
 */

@RunWith(J8Unit4.class)
public class AbstractTypeVisitor6Test<R, P>
implements AbstractTypeVisitor6Tests<AbstractTypeVisitor6<R, P>, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.AbstractTypeVisitor6]

    @Override
    public AbstractTypeVisitor6<R, P> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.util.AbstractTypeVisitor6], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.AbstractTypeVisitor6]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.AbstractTypeVisitor6]

}
