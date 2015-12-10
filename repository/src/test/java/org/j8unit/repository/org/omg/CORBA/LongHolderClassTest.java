package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.LongHolderClassTests<org.omg.CORBA.LongHolder> {

    @Override
    public Class<org.omg.CORBA.LongHolder> createNewSUT() {
        return org.omg.CORBA.LongHolder.class;
    }

}
