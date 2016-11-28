package org.j8unit.repository.java.rmi.server;

import java.rmi.server.LogStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LogStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.LogStreamTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class LogStreamTest
implements LogStreamTests<LogStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.LogStream]

    @Override
    public LogStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.LogStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.LogStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.LogStream]

}
