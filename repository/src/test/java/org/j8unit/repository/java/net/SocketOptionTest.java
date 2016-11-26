package org.j8unit.repository.java.net;

import java.net.SocketOption;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SocketOption} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.SocketOptionTests}).
 */
@RunWith(J8Unit4.class)
public class SocketOptionTest<T>
implements SocketOptionTests<SocketOption<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketOption]

    @Override
    public SocketOption<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.SocketOption], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.SocketOption]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.SocketOption]

}
