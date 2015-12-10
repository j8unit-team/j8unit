package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OctetSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.OctetSeqHolderTests<org.omg.CORBA.OctetSeqHolder> {

    @Override
    public org.omg.CORBA.OctetSeqHolder createNewSUT() {
        return new org.omg.CORBA.OctetSeqHolder();
    }

}
