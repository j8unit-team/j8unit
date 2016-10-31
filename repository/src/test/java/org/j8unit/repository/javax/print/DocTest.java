package org.j8unit.repository.javax.print;

import javax.print.Doc;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocTest
implements org.j8unit.repository.javax.print.DocTests<Doc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.Doc]

    @Override
    public Doc createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.Doc], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.Doc]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.Doc]

}
