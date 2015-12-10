package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.BooleanHolderClassTests<org.omg.CORBA.BooleanHolder> {

    @Override
    public Class<org.omg.CORBA.BooleanHolder> createNewSUT() {
        return org.omg.CORBA.BooleanHolder.class;
    }

}
