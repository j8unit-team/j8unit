package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintJobAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintJobAttributeSet} (by simply
 * reusing the J8Unit test interface {@link PrintJobAttributeSetTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobAttributeSetTest
implements PrintJobAttributeSetTests<PrintJobAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintJobAttributeSet]

    @Override
    public PrintJobAttributeSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.PrintJobAttributeSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.PrintJobAttributeSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.PrintJobAttributeSet]

}
