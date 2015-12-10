package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentHolderTest
implements org.j8unit.repository.org.omg.CORBA.CurrentHolderTests<org.omg.CORBA.CurrentHolder> {

    @Override
    public org.omg.CORBA.CurrentHolder createNewSUT() {
        return new org.omg.CORBA.CurrentHolder();
    }

}
