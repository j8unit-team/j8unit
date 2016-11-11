package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.CurrentOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CurrentOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.CurrentOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class CurrentOperationsClassTest
implements CurrentOperationsClassTests<CurrentOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.CurrentOperations]

    @Override
    public Class<CurrentOperations> createNewSUT() {
        return CurrentOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.CurrentOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.CurrentOperations]

}
