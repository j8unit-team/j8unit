package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.SetOfIntegerSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SetOfIntegerSyntax} (by simply
 * reusing the J8Unit test interface {@link SetOfIntegerSyntaxTests}).
 */

@RunWith(J8Unit4.class)
public class SetOfIntegerSyntaxTest
implements SetOfIntegerSyntaxTests<SetOfIntegerSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.SetOfIntegerSyntax]

    @Override
    public SetOfIntegerSyntax createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.SetOfIntegerSyntax], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.SetOfIntegerSyntax]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.SetOfIntegerSyntax]

}
