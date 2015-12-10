package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.CharHolderClassTests<org.omg.CORBA.CharHolder> {

    @Override
    public Class<org.omg.CORBA.CharHolder> createNewSUT() {
        return org.omg.CORBA.CharHolder.class;
    }

}
