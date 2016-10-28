package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.OMGVMCID;

@RunWith(J8Unit4.class)
public class OMGVMCIDClassTest
implements org.j8unit.repository.org.omg.CORBA.OMGVMCIDClassTests<OMGVMCID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.OMGVMCID]

    @Override
    public Class<OMGVMCID> createNewSUT() {
        return OMGVMCID.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.OMGVMCID]

}
