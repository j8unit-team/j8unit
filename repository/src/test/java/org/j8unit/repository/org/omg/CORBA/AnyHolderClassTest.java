package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnyHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.AnyHolderClassTests<org.omg.CORBA.AnyHolder> {

    @Override
    public Class<org.omg.CORBA.AnyHolder> createNewSUT() {
        return org.omg.CORBA.AnyHolder.class;
    }

}
