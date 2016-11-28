package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractElementVisitor7;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractElementVisitor7} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.AbstractElementVisitor7Tests}).
 */
@RunWith(J8Unit4.class)
public class AbstractElementVisitor7Test<R, P>
implements AbstractElementVisitor7Tests<AbstractElementVisitor7<R, P>, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.AbstractElementVisitor7]

    @Override
    public AbstractElementVisitor7<R, P> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.util.AbstractElementVisitor7], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.AbstractElementVisitor7]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.AbstractElementVisitor7]

}
