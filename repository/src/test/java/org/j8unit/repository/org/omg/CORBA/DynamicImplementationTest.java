package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynamicImplementationTest
implements org.j8unit.repository.org.omg.CORBA.DynamicImplementationTests<org.omg.CORBA.DynamicImplementation> {

    @Override
    public org.omg.CORBA.DynamicImplementation createNewSUT() {
        return new org.omg.CORBA.DynamicImplementation();
    }

}
