package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.CharSeqHolderClassTests<org.omg.CORBA.CharSeqHolder> {

    @Override
    public Class<org.omg.CORBA.CharSeqHolder> createNewSUT() {
        return org.omg.CORBA.CharSeqHolder.class;
    }

}
