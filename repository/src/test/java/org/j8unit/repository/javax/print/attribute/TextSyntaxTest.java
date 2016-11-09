package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.TextSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextSyntax} (by simply reusing the
 * J8Unit test interface {@link TextSyntaxTests}).
 */

@RunWith(J8Unit4.class)
public class TextSyntaxTest
implements TextSyntaxTests<TextSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.TextSyntax]

    @Override
    public TextSyntax createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.TextSyntax], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.TextSyntax]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.TextSyntax]

}
