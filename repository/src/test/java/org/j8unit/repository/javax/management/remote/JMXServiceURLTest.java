package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXServiceURL;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JMXServiceURL} (by simply reusing the
 * J8Unit test interface {@link JMXServiceURLTests}).
 */

@RunWith(J8Unit4.class)
public class JMXServiceURLTest
implements JMXServiceURLTests<JMXServiceURL> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXServiceURL]

    @Override
    public JMXServiceURL createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.remote.JMXServiceURL], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXServiceURL]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXServiceURL]

}
