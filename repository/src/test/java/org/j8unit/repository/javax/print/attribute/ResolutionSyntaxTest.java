package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.ResolutionSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ResolutionSyntax} (by simply reusing
 * the J8Unit test interface {@link ResolutionSyntaxTests}).
 */

@RunWith(J8Unit4.class)
public class ResolutionSyntaxTest
implements ResolutionSyntaxTests<ResolutionSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.ResolutionSyntax]

    @Override
    public ResolutionSyntax createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.ResolutionSyntax], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.ResolutionSyntax]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.ResolutionSyntax]

}
