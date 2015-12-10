package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VM_NONEClassTest
implements org.j8unit.repository.org.omg.CORBA.VM_NONEClassTests<org.omg.CORBA.VM_NONE> {

    @Override
    public Class<org.omg.CORBA.VM_NONE> createNewSUT() {
        return org.omg.CORBA.VM_NONE.class;
    }

}
