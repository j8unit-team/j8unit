package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.ElementVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementVisitor} (by simply reusing
 * the J8Unit test interface {@link ElementVisitorTests}).
 */

@RunWith(J8Unit4.class)
public class ElementVisitorTest<R, P>
implements ElementVisitorTests<ElementVisitor<R, P>, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.ElementVisitor]

    @Override
    public ElementVisitor<R, P> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.element.ElementVisitor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.element.ElementVisitor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.element.ElementVisitor]

}
