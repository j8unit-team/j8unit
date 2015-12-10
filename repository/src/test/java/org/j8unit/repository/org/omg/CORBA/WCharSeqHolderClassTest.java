package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WCharSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.WCharSeqHolderClassTests<org.omg.CORBA.WCharSeqHolder> {

    @Override
    public Class<org.omg.CORBA.WCharSeqHolder> createNewSUT() {
        return org.omg.CORBA.WCharSeqHolder.class;
    }

}
