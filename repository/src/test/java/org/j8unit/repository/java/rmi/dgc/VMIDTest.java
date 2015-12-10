package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VMIDTest
implements org.j8unit.repository.java.rmi.dgc.VMIDTests<java.rmi.dgc.VMID> {

    @Override
    public java.rmi.dgc.VMID createNewSUT() {
        return new java.rmi.dgc.VMID();
    }

}
