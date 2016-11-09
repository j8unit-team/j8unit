package org.j8unit.repository.javax.print;

import javax.print.MultiDoc;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MultiDoc} (by simply reusing the
 * J8Unit test interface {@link MultiDocTests}).
 */

@RunWith(J8Unit4.class)
public class MultiDocTest
implements MultiDocTests<MultiDoc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.MultiDoc]

    @Override
    public MultiDoc createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.MultiDoc], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.MultiDoc]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.MultiDoc]

}
