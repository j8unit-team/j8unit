package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.VM_ABSTRACT;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link VM_ABSTRACT} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.VM_ABSTRACTClassTests}).
 */
@RunWith(J8Unit4.class)
public class VM_ABSTRACTClassTest
implements VM_ABSTRACTClassTests<VM_ABSTRACT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.VM_ABSTRACT]

    @Override
    public Class<VM_ABSTRACT> createNewSUT() {
        return VM_ABSTRACT.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.VM_ABSTRACT]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.VM_ABSTRACT]

}
