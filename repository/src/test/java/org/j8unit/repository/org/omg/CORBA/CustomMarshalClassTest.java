package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CustomMarshalClassTest
implements org.j8unit.repository.org.omg.CORBA.CustomMarshalClassTests<org.omg.CORBA.CustomMarshal> {

    @Override
    public Class<org.omg.CORBA.CustomMarshal> createNewSUT() {
        return org.omg.CORBA.CustomMarshal.class;
    }

}
