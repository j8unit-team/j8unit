package org.j8unit.repository.javax.xml.transform.stax;

import javax.xml.transform.stax.StAXResult;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StAXResult} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.stax.StAXResultTests}).
 */
@RunWith(J8Unit4.class)
public class StAXResultTest
implements StAXResultTests<StAXResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.stax.StAXResult]

    @Override
    public StAXResult createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.transform.stax.StAXResult], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.stax.StAXResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.stax.StAXResult]

}
