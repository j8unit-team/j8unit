package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentClassTest
implements org.j8unit.repository.org.omg.CORBA.CurrentClassTests<org.omg.CORBA.Current> {

    @Override
    public Class<org.omg.CORBA.Current> createNewSUT() {
        return org.omg.CORBA.Current.class;
    }

}
