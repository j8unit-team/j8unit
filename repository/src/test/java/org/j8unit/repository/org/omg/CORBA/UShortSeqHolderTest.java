package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UShortSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.UShortSeqHolderTests<org.omg.CORBA.UShortSeqHolder> {

    @Override
    public org.omg.CORBA.UShortSeqHolder createNewSUT() {
        return new org.omg.CORBA.UShortSeqHolder();
    }

}
