package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WCharSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.WCharSeqHolderTests<org.omg.CORBA.WCharSeqHolder> {

    @Override
    public org.omg.CORBA.WCharSeqHolder createNewSUT() {
        return new org.omg.CORBA.WCharSeqHolder();
    }

}
