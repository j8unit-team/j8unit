package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.IDLTypeOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IDLTypeOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.IDLTypeOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class IDLTypeOperationsClassTest
implements IDLTypeOperationsClassTests<IDLTypeOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.IDLTypeOperations]

    @Override
    public Class<IDLTypeOperations> createNewSUT() {
        return IDLTypeOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.IDLTypeOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.IDLTypeOperations]

}
