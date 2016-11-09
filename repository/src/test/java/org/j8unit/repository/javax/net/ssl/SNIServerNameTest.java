package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SNIServerName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SNIServerName} (by simply reusing the
 * J8Unit test interface {@link SNIServerNameTests}).
 */

@RunWith(J8Unit4.class)
public class SNIServerNameTest
implements SNIServerNameTests<SNIServerName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SNIServerName]

    @Override
    public SNIServerName createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SNIServerName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SNIServerName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SNIServerName]

}
