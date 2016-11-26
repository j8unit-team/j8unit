package org.j8unit.repository.javax.print;

import javax.print.Doc;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Doc} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.print.DocTests}).
 */
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
