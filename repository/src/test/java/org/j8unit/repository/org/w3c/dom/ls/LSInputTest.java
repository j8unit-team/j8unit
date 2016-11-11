package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSInput;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LSInput} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSInputTests}).
 */

@RunWith(J8Unit4.class)
public class LSInputTest
implements LSInputTests<LSInput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.ls.LSInput]

    @Override
    public LSInput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.ls.LSInput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.ls.LSInput]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.ls.LSInput]

}
