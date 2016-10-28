package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.VM_NONE;

@RunWith(J8Unit4.class)
public class VM_NONEClassTest
implements org.j8unit.repository.org.omg.CORBA.VM_NONEClassTests<VM_NONE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.VM_NONE]

    @Override
    public Class<VM_NONE> createNewSUT() {
        return VM_NONE.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.VM_NONE]

}
