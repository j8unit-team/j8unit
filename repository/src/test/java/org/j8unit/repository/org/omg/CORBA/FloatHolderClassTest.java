package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.FloatHolderClassTests<org.omg.CORBA.FloatHolder> {

    @Override
    public Class<org.omg.CORBA.FloatHolder> createNewSUT() {
        return org.omg.CORBA.FloatHolder.class;
    }

}
