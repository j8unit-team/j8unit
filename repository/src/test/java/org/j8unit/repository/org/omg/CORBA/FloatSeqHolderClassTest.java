package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.FloatSeqHolderClassTests<org.omg.CORBA.FloatSeqHolder> {

    @Override
    public Class<org.omg.CORBA.FloatSeqHolder> createNewSUT() {
        return org.omg.CORBA.FloatSeqHolder.class;
    }

}
