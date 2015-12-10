package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UShortSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.UShortSeqHolderClassTests<org.omg.CORBA.UShortSeqHolder> {

    @Override
    public Class<org.omg.CORBA.UShortSeqHolder> createNewSUT() {
        return org.omg.CORBA.UShortSeqHolder.class;
    }

}
