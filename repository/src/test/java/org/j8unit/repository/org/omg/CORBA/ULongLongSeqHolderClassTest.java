package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ULongLongSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ULongLongSeqHolderClassTests<org.omg.CORBA.ULongLongSeqHolder> {

    @Override
    public Class<org.omg.CORBA.ULongLongSeqHolder> createNewSUT() {
        return org.omg.CORBA.ULongLongSeqHolder.class;
    }

}