package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VM_ABSTRACTClassTest
implements org.j8unit.repository.org.omg.CORBA.VM_ABSTRACTClassTests<org.omg.CORBA.VM_ABSTRACT> {

    @Override
    public Class<org.omg.CORBA.VM_ABSTRACT> createNewSUT() {
        return org.omg.CORBA.VM_ABSTRACT.class;
    }

}
