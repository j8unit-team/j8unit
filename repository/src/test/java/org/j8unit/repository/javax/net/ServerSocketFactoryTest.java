package org.j8unit.repository.javax.net;

import javax.net.ServerSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServerSocketFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ServerSocketFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ServerSocketFactoryTest
implements ServerSocketFactoryTests<ServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ServerSocketFactory]

    @Override
    public ServerSocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ServerSocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ServerSocketFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ServerSocketFactory]

}
