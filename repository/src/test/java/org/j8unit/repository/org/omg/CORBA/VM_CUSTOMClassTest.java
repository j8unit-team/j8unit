package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.VM_CUSTOM;

@RunWith(J8Unit4.class)
public class VM_CUSTOMClassTest
implements org.j8unit.repository.org.omg.CORBA.VM_CUSTOMClassTests<VM_CUSTOM> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.VM_CUSTOM]

    @Override
    public Class<VM_CUSTOM> createNewSUT() {
        return VM_CUSTOM.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.VM_CUSTOM]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.VM_CUSTOM]

}
