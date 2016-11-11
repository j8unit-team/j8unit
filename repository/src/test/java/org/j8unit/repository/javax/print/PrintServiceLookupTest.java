package org.j8unit.repository.javax.print;

import javax.print.PrintServiceLookup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintServiceLookup} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.print.PrintServiceLookupTests}).
 */

@RunWith(J8Unit4.class)
public class PrintServiceLookupTest
implements PrintServiceLookupTests<PrintServiceLookup> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.PrintServiceLookup]

    @Override
    public PrintServiceLookup createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.PrintServiceLookup], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.PrintServiceLookup]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.PrintServiceLookup]

}
