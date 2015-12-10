package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnyHolderTest
implements org.j8unit.repository.org.omg.CORBA.AnyHolderTests<org.omg.CORBA.AnyHolder> {

    @Override
    public org.omg.CORBA.AnyHolder createNewSUT() {
        return new org.omg.CORBA.AnyHolder();
    }

}
