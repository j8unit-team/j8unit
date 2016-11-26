package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.OutputKeys;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OutputKeys} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.OutputKeysTests}).
 */
@RunWith(J8Unit4.class)
public class OutputKeysTest
implements OutputKeysTests<OutputKeys> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.OutputKeys]

    @Override
    public OutputKeys createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.transform.OutputKeys], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.OutputKeys]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.OutputKeys]

}
