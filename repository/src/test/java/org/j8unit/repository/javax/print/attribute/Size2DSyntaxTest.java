package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.Size2DSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Size2DSyntax} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.Size2DSyntaxTests}).
 */

@RunWith(J8Unit4.class)
public class Size2DSyntaxTest
implements Size2DSyntaxTests<Size2DSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.Size2DSyntax]

    @Override
    public Size2DSyntax createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.Size2DSyntax], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.Size2DSyntax]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.Size2DSyntax]

}
