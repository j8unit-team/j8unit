package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.IDLType;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IDLType} (by simply reusing the
 * J8Unit test interface {@link IDLTypeTests}).
 */

@RunWith(J8Unit4.class)
public class IDLTypeTest
implements IDLTypeTests<IDLType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.IDLType]

    @Override
    public IDLType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.IDLType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.IDLType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.IDLType]

}
