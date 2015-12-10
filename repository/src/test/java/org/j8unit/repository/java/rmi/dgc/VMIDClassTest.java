package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VMIDClassTest
implements org.j8unit.repository.java.rmi.dgc.VMIDClassTests<java.rmi.dgc.VMID> {

    @Override
    public Class<java.rmi.dgc.VMID> createNewSUT() {
        return java.rmi.dgc.VMID.class;
    }

}
