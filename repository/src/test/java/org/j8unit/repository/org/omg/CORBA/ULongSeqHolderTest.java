package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ULongSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.ULongSeqHolderTests<org.omg.CORBA.ULongSeqHolder> {

    @Override
    public org.omg.CORBA.ULongSeqHolder createNewSUT() {
        return new org.omg.CORBA.ULongSeqHolder();
    }

}
