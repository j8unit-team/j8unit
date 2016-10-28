package org.j8unit.repository.javax.print;

import javax.print.PrintServiceLookup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceLookupTest
implements org.j8unit.repository.javax.print.PrintServiceLookupTests<PrintServiceLookup> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.PrintServiceLookup]

    @Override
    public PrintServiceLookup createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.PrintServiceLookup], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.PrintServiceLookup]

}
