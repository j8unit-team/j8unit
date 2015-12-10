package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ULongSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ULongSeqHolderClassTests<org.omg.CORBA.ULongSeqHolder> {

    @Override
    public Class<org.omg.CORBA.ULongSeqHolder> createNewSUT() {
        return org.omg.CORBA.ULongSeqHolder.class;
    }

}
