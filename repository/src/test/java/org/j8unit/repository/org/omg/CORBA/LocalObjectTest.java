package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocalObjectTest
implements org.j8unit.repository.org.omg.CORBA.LocalObjectTests<org.omg.CORBA.LocalObject> {

    @Override
    public org.omg.CORBA.LocalObject createNewSUT() {
        return new org.omg.CORBA.LocalObject();
    }

}
