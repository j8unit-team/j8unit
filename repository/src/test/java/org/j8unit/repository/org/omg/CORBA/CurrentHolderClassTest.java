package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.CurrentHolderClassTests<org.omg.CORBA.CurrentHolder> {

    @Override
    public Class<org.omg.CORBA.CurrentHolder> createNewSUT() {
        return org.omg.CORBA.CurrentHolder.class;
    }

}