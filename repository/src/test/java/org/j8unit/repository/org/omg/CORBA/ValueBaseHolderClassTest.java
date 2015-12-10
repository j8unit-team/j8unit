package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueBaseHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ValueBaseHolderClassTests<org.omg.CORBA.ValueBaseHolder> {

    @Override
    public Class<org.omg.CORBA.ValueBaseHolder> createNewSUT() {
        return org.omg.CORBA.ValueBaseHolder.class;
    }

}
