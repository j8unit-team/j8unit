package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.IDLEntity;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IDLEntity} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests}).
 */
@RunWith(J8Unit4.class)
public class IDLEntityTest
implements IDLEntityTests<IDLEntity> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.IDLEntity]

    @Override
    public IDLEntity createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.IDLEntity], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.IDLEntity]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.IDLEntity]

}
