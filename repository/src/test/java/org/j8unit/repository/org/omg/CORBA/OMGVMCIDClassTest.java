package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OMGVMCIDClassTest
implements org.j8unit.repository.org.omg.CORBA.OMGVMCIDClassTests<org.omg.CORBA.OMGVMCID> {

    @Override
    public Class<org.omg.CORBA.OMGVMCID> createNewSUT() {
        return org.omg.CORBA.OMGVMCID.class;
    }

}
