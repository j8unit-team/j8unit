package org.j8unit.repository.javax.print;

import javax.print.SimpleDoc;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleDocTest
implements org.j8unit.repository.javax.print.SimpleDocTests<SimpleDoc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.SimpleDoc]

    @Override
    public SimpleDoc createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.SimpleDoc], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.SimpleDoc]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.SimpleDoc]

}
