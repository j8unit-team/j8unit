package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.StringHolderClassTests<org.omg.CORBA.StringHolder> {

    @Override
    public Class<org.omg.CORBA.StringHolder> createNewSUT() {
        return org.omg.CORBA.StringHolder.class;
    }

}
