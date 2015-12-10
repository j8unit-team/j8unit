package org.j8unit.repository.org.omg.CORBA.ORBPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidNameTest
implements org.j8unit.repository.org.omg.CORBA.ORBPackage.InvalidNameTests<org.omg.CORBA.ORBPackage.InvalidName> {

    @Override
    public org.omg.CORBA.ORBPackage.InvalidName createNewSUT() {
        return new org.omg.CORBA.ORBPackage.InvalidName();
    }

}
