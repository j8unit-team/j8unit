package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXAddressable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXAddressable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.remote.JMXAddressableClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXAddressableClassTest
implements JMXAddressableClassTests<JMXAddressable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXAddressable]

    @Override
    public Class<JMXAddressable> createNewSUT() {
        return JMXAddressable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXAddressable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXAddressable]

}
