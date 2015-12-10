package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectHolderTest
implements org.j8unit.repository.org.omg.CORBA.ObjectHolderTests<org.omg.CORBA.ObjectHolder> {

    @Override
    public org.omg.CORBA.ObjectHolder createNewSUT() {
        return new org.omg.CORBA.ObjectHolder();
    }

}
