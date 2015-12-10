package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.BooleanSeqHolderTests<org.omg.CORBA.BooleanSeqHolder> {

    @Override
    public org.omg.CORBA.BooleanSeqHolder createNewSUT() {
        return new org.omg.CORBA.BooleanSeqHolder();
    }

}
