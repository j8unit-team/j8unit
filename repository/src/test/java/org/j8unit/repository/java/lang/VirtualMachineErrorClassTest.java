package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VirtualMachineErrorClassTest
implements org.j8unit.repository.java.lang.VirtualMachineErrorClassTests<java.lang.VirtualMachineError> {

    @Override
    public Class<java.lang.VirtualMachineError> createNewSUT() {
        return java.lang.VirtualMachineError.class;
    }

}
