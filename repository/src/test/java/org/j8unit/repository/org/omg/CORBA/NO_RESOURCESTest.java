package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_RESOURCESTest
implements org.j8unit.repository.org.omg.CORBA.NO_RESOURCESTests<org.omg.CORBA.NO_RESOURCES> {

    @Override
    public org.omg.CORBA.NO_RESOURCES createNewSUT() {
        return new org.omg.CORBA.NO_RESOURCES();
    }

}
