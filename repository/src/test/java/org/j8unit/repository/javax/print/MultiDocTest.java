package org.j8unit.repository.javax.print;

import javax.print.MultiDoc;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiDocTest
implements org.j8unit.repository.javax.print.MultiDocTests<MultiDoc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDoc]

    @Override
    public MultiDoc createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.MultiDoc], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDoc]

}
