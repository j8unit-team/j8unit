package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.VM_ABSTRACT;

@RunWith(J8Unit4.class)
public class VM_ABSTRACTClassTest
implements org.j8unit.repository.org.omg.CORBA.VM_ABSTRACTClassTests<VM_ABSTRACT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.VM_ABSTRACT]

    @Override
    public Class<VM_ABSTRACT> createNewSUT() {
        return VM_ABSTRACT.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.VM_ABSTRACT]

}
