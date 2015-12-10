package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_RESOURCESClassTest
implements org.j8unit.repository.org.omg.CORBA.NO_RESOURCESClassTests<org.omg.CORBA.NO_RESOURCES> {

    @Override
    public Class<org.omg.CORBA.NO_RESOURCES> createNewSUT() {
        return org.omg.CORBA.NO_RESOURCES.class;
    }

}
