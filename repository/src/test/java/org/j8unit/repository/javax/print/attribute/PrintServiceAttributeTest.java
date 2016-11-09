package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintServiceAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintServiceAttribute} (by simply
 * reusing the J8Unit test interface {@link PrintServiceAttributeTests}).
 */

@RunWith(J8Unit4.class)
public class PrintServiceAttributeTest
implements PrintServiceAttributeTests<PrintServiceAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintServiceAttribute]

    @Override
    public PrintServiceAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.PrintServiceAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.PrintServiceAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.PrintServiceAttribute]

}
