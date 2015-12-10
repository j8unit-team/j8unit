package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ShortHolderClassTests<org.omg.CORBA.ShortHolder> {

    @Override
    public Class<org.omg.CORBA.ShortHolder> createNewSUT() {
        return org.omg.CORBA.ShortHolder.class;
    }

}
