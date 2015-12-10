package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ObjectHolderClassTests<org.omg.CORBA.ObjectHolder> {

    @Override
    public Class<org.omg.CORBA.ObjectHolder> createNewSUT() {
        return org.omg.CORBA.ObjectHolder.class;
    }

}
