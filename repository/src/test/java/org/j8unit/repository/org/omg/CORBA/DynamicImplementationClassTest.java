package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynamicImplementationClassTest
implements org.j8unit.repository.org.omg.CORBA.DynamicImplementationClassTests<org.omg.CORBA.DynamicImplementation> {

    @Override
    public Class<org.omg.CORBA.DynamicImplementation> createNewSUT() {
        return org.omg.CORBA.DynamicImplementation.class;
    }

}
