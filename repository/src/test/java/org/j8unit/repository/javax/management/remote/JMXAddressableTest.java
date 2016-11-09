package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXAddressable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JMXAddressable} (by simply reusing
 * the J8Unit test interface {@link JMXAddressableTests}).
 */

@RunWith(J8Unit4.class)
public class JMXAddressableTest
implements JMXAddressableTests<JMXAddressable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXAddressable]

    @Override
    public JMXAddressable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXAddressable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXAddressable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXAddressable]

}
