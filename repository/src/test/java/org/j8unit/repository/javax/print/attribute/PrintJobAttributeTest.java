package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintJobAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintJobAttribute} (by simply reusing
 * the J8Unit test interface {@link PrintJobAttributeTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobAttributeTest
implements PrintJobAttributeTests<PrintJobAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintJobAttribute]

    @Override
    public PrintJobAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.PrintJobAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.PrintJobAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.PrintJobAttribute]

}
