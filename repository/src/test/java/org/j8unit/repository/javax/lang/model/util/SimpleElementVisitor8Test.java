package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleElementVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SimpleElementVisitor8} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.SimpleElementVisitor8Tests}).
 */
@RunWith(J8Unit4.class)
public class SimpleElementVisitor8Test<R, P>
implements SimpleElementVisitor8Tests<SimpleElementVisitor8<R, P>, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.SimpleElementVisitor8]

    @Override
    public SimpleElementVisitor8<R, P> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.lang.model.util.SimpleElementVisitor8], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.SimpleElementVisitor8]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.SimpleElementVisitor8]

}
