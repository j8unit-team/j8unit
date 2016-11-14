package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SNIHostName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SNIHostName} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SNIHostNameTests}).
 */

@RunWith(J8Unit4.class)
public class SNIHostNameTest
implements SNIHostNameTests<SNIHostName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SNIHostName]

    @Override
    public SNIHostName createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.SNIHostName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SNIHostName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SNIHostName]

}
