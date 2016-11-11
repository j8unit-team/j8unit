package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.IDLEntity;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IDLEntity} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.portable.IDLEntityClassTests}).
 */

@RunWith(J8Unit4.class)
public class IDLEntityClassTest
implements IDLEntityClassTests<IDLEntity> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.IDLEntity]

    @Override
    public Class<IDLEntity> createNewSUT() {
        return IDLEntity.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.IDLEntity]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.IDLEntity]

}
