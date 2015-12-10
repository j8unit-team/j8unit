package org.j8unit.repository.org.omg.CORBA.ORBPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidNameClassTest
implements org.j8unit.repository.org.omg.CORBA.ORBPackage.InvalidNameClassTests<org.omg.CORBA.ORBPackage.InvalidName> {

    @Override
    public Class<org.omg.CORBA.ORBPackage.InvalidName> createNewSUT() {
        return org.omg.CORBA.ORBPackage.InvalidName.class;
    }

}
