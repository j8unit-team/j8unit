package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintRequestAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintRequestAttributeSet} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetTests}).
 */

@RunWith(J8Unit4.class)
public class PrintRequestAttributeSetTest
implements PrintRequestAttributeSetTests<PrintRequestAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintRequestAttributeSet]

    @Override
    public PrintRequestAttributeSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.PrintRequestAttributeSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.PrintRequestAttributeSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.PrintRequestAttributeSet]

}
