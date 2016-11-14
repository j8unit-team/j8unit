package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.IRObjectOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IRObjectOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.IRObjectOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class IRObjectOperationsClassTest
implements IRObjectOperationsClassTests<IRObjectOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.IRObjectOperations]

    @Override
    public Class<IRObjectOperations> createNewSUT() {
        return IRObjectOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.IRObjectOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.IRObjectOperations]

}
