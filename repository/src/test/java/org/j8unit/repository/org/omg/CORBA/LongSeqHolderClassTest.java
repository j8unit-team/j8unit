package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.LongSeqHolderClassTests<org.omg.CORBA.LongSeqHolder> {

    @Override
    public Class<org.omg.CORBA.LongSeqHolder> createNewSUT() {
        return org.omg.CORBA.LongSeqHolder.class;
    }

}
