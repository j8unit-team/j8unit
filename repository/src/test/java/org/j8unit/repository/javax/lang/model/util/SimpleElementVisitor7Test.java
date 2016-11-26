package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleElementVisitor7;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SimpleElementVisitor7} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.SimpleElementVisitor7Tests}).
 */
@RunWith(J8Unit4.class)
public class SimpleElementVisitor7Test<R, P>
implements SimpleElementVisitor7Tests<SimpleElementVisitor7<R, P>, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.SimpleElementVisitor7]

    @Override
    public SimpleElementVisitor7<R, P> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.lang.model.util.SimpleElementVisitor7], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.SimpleElementVisitor7]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.SimpleElementVisitor7]

}
