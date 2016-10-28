package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.VM_CUSTOM;

@RunWith(J8Unit4.class)
public class VM_CUSTOMTest
implements org.j8unit.repository.org.omg.CORBA.VM_CUSTOMTests<VM_CUSTOM> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.VM_CUSTOM]

    @Override
    public VM_CUSTOM createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.VM_CUSTOM], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.VM_CUSTOM]

}
