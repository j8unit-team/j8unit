package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongLongSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.LongLongSeqHolderTests<org.omg.CORBA.LongLongSeqHolder> {

    @Override
    public org.omg.CORBA.LongLongSeqHolder createNewSUT() {
        return new org.omg.CORBA.LongLongSeqHolder();
    }

}
