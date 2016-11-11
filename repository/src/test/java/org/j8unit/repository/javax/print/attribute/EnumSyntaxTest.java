package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.EnumSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EnumSyntax} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.EnumSyntaxTests}).
 */

@RunWith(J8Unit4.class)
public class EnumSyntaxTest
implements EnumSyntaxTests<EnumSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.EnumSyntax]

    @Override
    public EnumSyntax createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.EnumSyntax], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.EnumSyntax]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.EnumSyntax]

}
