package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.StringSeqHolderClassTests<org.omg.CORBA.StringSeqHolder> {

    @Override
    public Class<org.omg.CORBA.StringSeqHolder> createNewSUT() {
        return org.omg.CORBA.StringSeqHolder.class;
    }

}
