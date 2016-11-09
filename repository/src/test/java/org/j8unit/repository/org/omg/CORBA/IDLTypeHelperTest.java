package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.IDLTypeHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IDLTypeHelper} (by simply reusing the
 * J8Unit test interface {@link IDLTypeHelperTests}).
 */

@RunWith(J8Unit4.class)
public class IDLTypeHelperTest
implements IDLTypeHelperTests<IDLTypeHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.IDLTypeHelper]

    @Override
    public IDLTypeHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.IDLTypeHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.IDLTypeHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.IDLTypeHelper]

}
