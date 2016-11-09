package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GSSName} (by simply reusing the
 * J8Unit test interface {@link GSSNameTests}).
 */

@RunWith(J8Unit4.class)
public class GSSNameTest
implements GSSNameTests<GSSName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.GSSName]

    @Override
    public GSSName createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.ietf.jgss.GSSName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.ietf.jgss.GSSName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.ietf.jgss.GSSName]

}
