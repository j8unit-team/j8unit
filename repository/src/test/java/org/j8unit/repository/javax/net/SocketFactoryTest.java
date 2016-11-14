package org.j8unit.repository.javax.net;

import javax.net.SocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SocketFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.SocketFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class SocketFactoryTest
implements SocketFactoryTests<SocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.SocketFactory]

    @Override
    public SocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.SocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.SocketFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.SocketFactory]

}
