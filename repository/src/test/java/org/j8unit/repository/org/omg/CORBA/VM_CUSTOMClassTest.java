package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VM_CUSTOMClassTest
implements org.j8unit.repository.org.omg.CORBA.VM_CUSTOMClassTests<org.omg.CORBA.VM_CUSTOM> {

    @Override
    public Class<org.omg.CORBA.VM_CUSTOM> createNewSUT() {
        return org.omg.CORBA.VM_CUSTOM.class;
    }

}
