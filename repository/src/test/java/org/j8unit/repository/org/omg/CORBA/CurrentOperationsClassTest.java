package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentOperationsClassTest
implements org.j8unit.repository.org.omg.CORBA.CurrentOperationsClassTests<org.omg.CORBA.CurrentOperations> {

    @Override
    public Class<org.omg.CORBA.CurrentOperations> createNewSUT() {
        return org.omg.CORBA.CurrentOperations.class;
    }

}
