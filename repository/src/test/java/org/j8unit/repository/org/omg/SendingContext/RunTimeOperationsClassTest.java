package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.SendingContext.RunTimeOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RunTimeOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.SendingContext.RunTimeOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class RunTimeOperationsClassTest
implements RunTimeOperationsClassTests<RunTimeOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.SendingContext.RunTimeOperations]

    @Override
    public Class<RunTimeOperations> createNewSUT() {
        return RunTimeOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.SendingContext.RunTimeOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.SendingContext.RunTimeOperations]

}
