package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DomainManagerOperationsClassTest
implements org.j8unit.repository.org.omg.CORBA.DomainManagerOperationsClassTests<org.omg.CORBA.DomainManagerOperations> {

    @Override
    public Class<org.omg.CORBA.DomainManagerOperations> createNewSUT() {
        return org.omg.CORBA.DomainManagerOperations.class;
    }

}
