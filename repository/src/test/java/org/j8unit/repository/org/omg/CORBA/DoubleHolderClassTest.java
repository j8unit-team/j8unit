package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.DoubleHolderClassTests<org.omg.CORBA.DoubleHolder> {

    @Override
    public Class<org.omg.CORBA.DoubleHolder> createNewSUT() {
        return org.omg.CORBA.DoubleHolder.class;
    }

}
